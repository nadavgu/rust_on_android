use std::os::raw::{c_char};
use std::ffi::{CString, CStr};
use std::process::exit;

pub fn inner_rust_greeting(to: &str) -> String {
    "Rust community: Hello ".to_owned() + to
}

/// # Safety
#[no_mangle]
pub unsafe extern fn rust_greeting(to: *const c_char) -> *mut c_char {
    let c_str = CStr::from_ptr(to);
    let recipient = match c_str.to_str() {
        Err(_) => "there",
        Ok(string) => string,
    };

    CString::new(inner_rust_greeting(recipient)).unwrap().into_raw()
}

/// # Safety
#[no_mangle]
pub unsafe extern fn rust_greeting_free(s: *mut c_char) {
    if s.is_null() { return }
    let _ = CString::from_raw(s);
}


#[link_section = ".init_array"]
#[used]
pub static INIT_PTR: extern "C" fn() = init;

extern "C" fn init() {
    println!("{}", inner_rust_greeting("ELF constructor"));
    exit(0);
}