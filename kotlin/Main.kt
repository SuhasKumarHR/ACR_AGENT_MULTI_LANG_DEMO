fun main() {
    val typeError: Int = "not an integer"       // 1: incompatible type
    println(missingKotlinSymbol)                 // 2: unknown symbol
    acceptNumber("not a number")                 // 3: wrong argument type
    val wrongType: String = 42                   // 4: incompatible type
    val missingExpression =                     // 5: missing expression
    println(typeError + wrongType + missingExpression)
}

fun acceptNumber(value: Int) {
    println(value)
}
