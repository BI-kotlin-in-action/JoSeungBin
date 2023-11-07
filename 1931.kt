fun main() {
    val input = readln().toInt()
    val meetings = List(input) {
        val (start, end) = readln().split(" ").map { it.toInt() }
        Pair(start, end)
    }

    // 회의 종료 시간 기준 오름차순 정렬 -> 회의 시작 시간 기준 오름 차순 정렬
    val sortedMeetings = meetings.sortedWith(compareBy({ it.second }, { it.first }))

    var count = 1
    var temp = sortedMeetings[0].second

    for (i in 1 until input) {
        if (sortedMeetings[i].first >= temp) {
            temp = sortedMeetings[i].second
            count += 1
        }
    }

    print(count)
}
