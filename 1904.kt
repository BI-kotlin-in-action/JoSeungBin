fun main() {
    val dp = IntArray(1000001)

    val n = readln().toInt()

    dp[1] = 1
    dp[2] = 2
    for (i in 3..n) {
        dp[i] = (dp[i - 2] + dp[i - 1]) % 15746
    }
    print(dp[n] % 15746)
}
