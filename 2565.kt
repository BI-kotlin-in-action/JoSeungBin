fun main() {
    val input = readln().toInt()

    val A = IntArray(100)
    val B = IntArray(100)

    for (i in 0 until input) {
        val (firstInput, secondInput) = readln().split(" ").map { it.toInt() }
        A[i] = firstInput
        B[i] = secondInput
    }
    
    // array sort
    for (i in 0 until 100) {
        var minIndex = i
        if (A[i] != 0) {
            for (j in i + 1 until 100) {
                if (A[j] < A[minIndex]) {
                    minIndex = j
                }
            }

            if (minIndex != i) {
                // A array
                val tempA = A[i]
                A[i] = A[minIndex]
                A[minIndex] = tempA

                // B array
                val tempB = B[i]
                B[i] = B[minIndex]
                B[minIndex] = tempB
            }
        }
    }

    val Bmax = IntArray(100) { 1 }
    for (i in 100 - input until 100) {
        for (j in 100 - input..i) {
            // 증가하는 바이토닉 수열
            if (B[j] < B[i] && Bmax[i] <= Bmax[j] && B[j] != 0 && B[i] != 0) {
                Bmax[i] = Bmax[j] + 1
            }
        }
    }

    var maxhigh = Bmax[0]
    for (i in 100 - input until 100) {
        if (maxhigh < Bmax[i]) maxhigh = Bmax[i]
    }
    print(input - maxhigh)
}
