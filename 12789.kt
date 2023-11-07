import java.util.Stack
import kotlin.collections.ArrayDeque

fun main() {
    val firstLine = ArrayDeque<Int>()
    val secondLine = Stack<Int>()

    val input = readln().toInt()
    val inputList: List<Int> = readln().split(" ").map { it.toInt() }

    firstLine.addAll(inputList)
    
    var n = 1
    while (firstLine.isNotEmpty()) {
        when {
            firstLine.first() == n -> {
                firstLine.removeFirst()
                n += 1
            }
            !secondLine.empty() && secondLine.last() == n -> {
                secondLine.pop()
                n += 1
            }
            else -> secondLine.push(firstLine.removeFirst())
        }
    }
        
    while (secondLine.isNotEmpty()) {
        when {
            secondLine.last() == n -> {
                secondLine.pop()
                n += 1
            }
            else -> break
        }
    }
    
    when {
        firstLine.isEmpty() && secondLine.isEmpty() -> print("Nice")
        else -> print("Sad")
    } 
}
