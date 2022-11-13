#[path = "./lib.rs"] mod template_lib;

use template_lib::inner_rust_greeting;

fn main() {
    let info = "from executable";
    println!("{}", inner_rust_greeting(info));
}
