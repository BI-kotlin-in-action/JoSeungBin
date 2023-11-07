fun main() {
    val input = readln().toInt()
    val inputList: List<Int> = readln().split(" ").map { it.toInt() }
    
    val maxArr = IntArray(input) { 1 }
    val minArr = IntArray(input) { 1 }
    for (i in 0 until input) {
        for (j in 0..i) {
            // 증가하는 바이토닉 수열
            if (inputList[j] < inputList[i] && maxArr[i] <= maxArr[j]) {
                maxArr[i] = maxArr[j] + 1
            }
            // 감소하는 바이토닉 수열
            if (inputList[input - 1 - j] < inputList[input - 1 - i] &&
                minArr[input - 1 - i] <= minArr[input - 1 - j]
            ) {
                minArr[input - 1 - i] = minArr[input - 1 - j] + 1
            }
        }
    }

    var high = maxArr[0] + minArr[0] - 1
    for (i in 0 until input) {
        if (maxArr[i] + minArr[i] - 1 > high) {
            high = maxArr[i] + minArr[i] - 1
        }
    }

    print(high)
}
