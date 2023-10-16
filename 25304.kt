import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var total = sc.nextInt()
    val count = sc.nextInt()

    repeat(count) {
        val price = sc.nextInt()
        val num = sc.nextInt()
        total -= price * num
    }

    println(if (total == 0) "Yes" else "No")
}
