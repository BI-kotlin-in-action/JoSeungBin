fun main() {
    while(true){
        val (num1, num2, num3) = readln().split(" ").map { it.toInt() }

        if(num1 == 0) return

        var result = when {
            maxOf(num1, num2, num3) * 2 >= num1 + num2 + num3 -> "Invalid"
            num1 != num2 && num2 != num3 && num1 != num3 -> "Scalene"
            num1 == num2 && num2 == num3 -> "Equilateral"
            num1 == num2 && num2 != num3 || num2 == num3 && num1 != num3 || num1 == num3 && num3 != num2 -> "Isosceles"
            else -> return
        }
        println(result)
    }
}