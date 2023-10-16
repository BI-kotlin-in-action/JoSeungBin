import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var num1: Int
    var num2: Int
    var num3: Int

    do {
        num1 = scanner.nextInt()
        num2 = scanner.nextInt()
        num3 = scanner.nextInt()

        if (num1 != 0) {
            val maxNum = findMax(num1, num2, num3)
            when {
                maxNum * 2 >= num1 + num2 + num3 -> println("Invalid")
                num1 != num2 && num2 != num3 && num1 != num3 -> println("Scalene")
                num1 == num2 && num2 == num3 -> println("Equilateral")
                num1 == num2 && num2 != num3 || num2 == num3 && num1 != num3 || num1 == num3 && num3 != num2 -> println("Isosceles")
            }
        }
    } while (num1 != 0)
}

fun findMax(num1: Int, num2: Int, num3: Int): Int {
    return maxOf(num1, maxOf(num2, num3))
}
