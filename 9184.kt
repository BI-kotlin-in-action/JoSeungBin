fun w(a: Int, b: Int, c: Int, dp: Array<Array<IntArray>>): Int {
    when {
        a <= 0 || b <= 0 || c <= 0 -> return 1
        a > 20 || b > 20 || c > 20 -> return w(20, 20, 20, dp)
        dp[a][b][c] != 0 -> dp[a][b][c]
        a < b && b < c -> {
            dp[a][b][c] = w(a, b, c - 1, dp) + w(a, b - 1, c - 1, dp) - w(a, b - 1, c, dp)
            return dp[a][b][c]
        }
        a >= b || b >= c -> {
            dp[a][b][c] = (w(a - 1, b, c, dp) + w(a - 1, b - 1, c, dp) + w(a - 1, b, c - 1, dp) - w(a - 1, b - 1, c - 1, dp))
            return dp[a][b][c]
        }
        else -> return dp[a][b][c]
    }
    return dp[a][b][c]
}

fun main() {
    val dp = Array(21) { Array(21) { IntArray(21) } }
    while (true) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        if (a == -1 && b == -1 && c == -1) {
            break
        }
        val result = w(a, b, c, dp)
        println("w($a, $b, $c) = $result")
    }
}
