package main

import "fmt"

func main() {
    var typeError int = "not an integer" // 1: incompatible type
    var missingSymbol = missingGoSymbol  // 2: undefined symbol
    unusedValue := 3                    // 3: declared and not used
    var anotherTypeError string = 42     // 4: incompatible type
    var flag bool = 1                    // 5: incompatible type
    fmt.Println(typeError, missingSymbol, unusedValue, anotherTypeError, flag)
}
