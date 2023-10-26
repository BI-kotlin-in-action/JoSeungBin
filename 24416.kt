package SecondWeek

fun fib(n: Int): Int {
    if (n == 1 || n == 2) {
        return 1
    }
    return fib(n - 1) + fib(n - 2)
}

fun fibonacci(n: Int, b_count: Int): Int {
    val f = IntArray(n + 1)
    f[1] = 1
    f[2] = 1

    for (i in 3..n) {
        f[i] = f[i - 1] + f[i - 2]
    }
    return b_count + (n - 2)
}
fun main() {
    val n = readln().toInt()
    var a_count = fib(n)
    val b_count = fibonacci(n, 0)
    print("$a_count $b_count")
}
