import java.util.*
import kotlin.collections.ArrayDeque

fun main() {
    val firstLine = ArrayDeque<Int>()
    val secondLine = Stack<Int>()

    val input = readln().toInt()
    val inputList: List<Int> = readln().split(" ").map { it.toInt() }
    
    for (i in 0 until input) firstLine.add(inputList[i])
    
    var N = 1
    while (!firstLine.isEmpty()) {
        when {
            firstLine.first() == N -> {
                firstLine.removeFirst()
                N += 1
            }
            !secondLine.empty() && secondLine.last() == N -> {
                secondLine.pop()
                N += 1
            }
            else -> secondLine.push(firstLine.removeFirst())
        }
    }
        
    while (!secondLine.empty()) {
        when {
            secondLine.last() == N -> {
                secondLine.pop()
                N += 1
            }
            else -> break
        }
    }
    
    when {
        firstLine.isEmpty() && secondLine.empty() -> print("Nice")
        else -> print("Sad")
    } 
}
