import kotlin.math.abs

class ChessBoard(input: Int) {
    fun getBoard(x: Int): Int {
        return board[x]
    }
    
    private val board = IntArray(input)
    var count: Int = 0
    
    fun setBoard(x: Int, value: Int) {
        board[x] = value
    }
}

// y열에 하나씩 있어야 하므로 x위치만 계산
fun main() {
    val input = readln().toInt()
    val board = ChessBoard(input)
    
    travel(0, board, input)
    print(board.count)
}

fun travel(x: Int, board: ChessBoard, input: Int) {
    if (x == input) {
        board.count += 1
        return
    }
    for (i in 0 until input) {
        board.setBoard(x, i)
        if (canExist(board, x)) {
            travel(x + 1, board, input)
        }
    }
}

fun canExist(board: ChessBoard, x: Int): Boolean {
    // 같은 열과 대각선 체크
    for (i in 0 until x) {
        if (board.getBoard(x) == board.getBoard(i) || x - i == abs(board.getBoard(x) - board.getBoard(i))) {
            return false
        }
    }
    return true
}
