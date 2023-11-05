fun main() {
    val array = IntArray(26) { 0 } 

    val size = readln().toInt()

    for (i in 0..size - 1) {
        val input = readln()
        array[input[0].toInt() - 97]++ 

    }

    val max = array.maxOrNull() ?: 0

    if (max < 5) {
        println("PREDAJA")
    } else {
        for (i in 0..array.size - 1) {
            if (array[i] >= 5) {
                print((i + 97).toChar()) 
            }
        }
    }
}
