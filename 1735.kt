fun main() {
    val (numeratorA, denominatorA) = readln().split(" ").map { it.toInt() }
    val (numeratorB, denominatorB) = readln().split(" ").map { it.toInt() }

    var numerator = (numeratorA * denominatorB) + (numeratorB * denominatorA)
    var denominator = denominatorA * denominatorB

    val gcd = calculateGcd(numerator, denominator)
    numerator /= gcd
    denominator /= gcd

    print("$numerator $denominator")
}
fun calculateGcd(numerator: Int, denominator: Int): Int {
    var num1 = numerator
    var num2 = denominator
    while (num2 != 0) {
        val numTemp = num2
        num2 = num1 % num2
        num1 = numTemp
    }
    return num1
}
