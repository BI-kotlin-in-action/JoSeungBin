import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        val num1 = scanner.nextInt()
        val num2 = scanner.nextInt()
        val num3 = scanner.nextInt()

        if (num1 == 0) return
        
        val maxNum = maxOf(num1, num2, num3)
        when {
            maxNum * 2 >= num1 + num2 + num3 -> println("Invalid")
            num1 != num2 && num2 != num3 && num1 != num3 -> println("Scalene")
            num1 == num2 && num2 == num3 -> println("Equilateral")
            num1 == num2 && num2 != num3 || num2 == num3 && num1 != num3 || num1 == num3 && num3 != num2 -> println("Isosceles")
        }
    }
}
