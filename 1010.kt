fun combination(n: Int, r: Int): Long {
    var result: Long = 1

    for (i in 1..r) {
        result = result * (n - i + 1) / i
    }

    return result
}

fun main() {
    val casesize = readln().toInt()

    for (i in 0..casesize - 1) {
        val (N, M) = readln().split(" ").map { it.toInt() }
        val result = combination(M, N)
        println(result)
    }
}
