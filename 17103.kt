fun main() {
    val caseSize = readln().toInt()
    val primeArr = IntArray(1000001) { it }

    // 에라토스테네스의 체
    var i = 2
    while (i * i <= 1000000) {
        if (primeArr[i] != 0) {
            var j = i + i
            while (j <= 1000000) {
                primeArr[j] = 0
                j += i
            }
        }
        i++
    }

    for (j in 0 until caseSize) {
        val input = readln().toInt()
        var count = 0
        for (k in 2 until input / 2 + 1) {
            if (primeArr[input - k] + primeArr[k] == input && primeArr[k] != 0 && primeArr[input - k] != 0) {
                count++
            }
        }
        println(count)
    }
}
