fun main() {
    var total = readln().toInt()
    val count = readln().toInt()

    repeat(count) {
        val (price, num) = readln().split(" ").map { it.toInt() }
        total -= price * num
    }

    println(if (total == 0) "Yes" else "No")
}
