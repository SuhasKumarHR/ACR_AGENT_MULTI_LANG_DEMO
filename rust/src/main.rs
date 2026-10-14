fn main() {
    let type_error: i32 = "not an integer";    // 1: incompatible type
    println!("{}", missing_rust_symbol);       // 2: unknown symbol
    let another_type_error: String = 42;        // 3: incompatible type
    missing_rust_function();                    // 4: unknown function
    let value = 1;
    println!("{}", value.missing_method());    // 5: unknown method
    println!("{} {}", type_error, another_type_error);
}
