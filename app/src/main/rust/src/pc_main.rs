#[path = "./lib.rs"] mod template_lib;

use template_lib::inner_rust_greeting;

fn main() {
    let info = "from PC";
    println!("{}", inner_rust_greeting(info));
}
