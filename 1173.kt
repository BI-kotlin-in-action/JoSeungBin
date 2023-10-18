fun main() {
    val (N, m, M, T, R) = readln().split(" ").map { it.toInt() }
    
    var curHeartRate = m // 초기 맥박
    var time = 0 // 운동하는데 필요한 시간
    var remainingExerciseTime = N // 남은 운동 시간

    while (remainingExerciseTime > 0) {
        // 운동 가능한 경우
        if (curHeartRate + T <= M) {
            curHeartRate += T
            time++
            remainingExerciseTime--
        } else {
            // 휴식
            curHeartRate -= R
            if (curHeartRate < m) {
                curHeartRate = m
            }
            time++
        }

        // 맥박이 m 이고, 휴식으로 인해 더 이상 운동할 수 없는 경우
        if (M - m < T) {
            println(-1)
            return
        }
    }

    println(time)
}
