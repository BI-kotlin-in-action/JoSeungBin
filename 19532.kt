fun main() {
    val list: List<Int> = readln().split(" ").map { it.toInt() }
    // val (a, b, c, d, e, f) = readln().split(" ").map { it.toInt() }
    for (i in -999..999) {
        for (j in -999..999) {
            if (list[0] * i + list[1] * j == list[2] && list[3] * i + list[4] * j == list[5]) print("$i $j")
        }
    }
}
