fun main() {
    val input = readln().toInt()
    var N = Array(input) { IntArray(2) }

    for (i in 0 until input) {
        val (tmp1, tmp2) = readln().split(" ").map { it.toInt() }
        N[i][0] = tmp1
        N[i][1] = tmp2
    }
    
    // 회의 종료 시간 기준 오름차순 정렬 -> 회의 시작 시간 기준 오름 차순 정렬
    N.sortWith(compareBy({ it[1] }, { it[0] })) 

    var count = 1
    var temp = N[0][1]
    for (i in 1 until input) {
        if (N[i][0] >= temp) {
            temp = N[i][1]
            count += 1
        }
    }
    print(count)
}
