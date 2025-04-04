fun isSudokuValid(board: List<List<Char>>, allowEmpty: Boolean = true): Boolean {
    if (board.isEmpty()) return false
    val size = board.size

    if (board.any { it.size != size }) return false

    val (validChars, subgridRows, subgridCols) = when (size) {
        3 -> Triple(('1'..'3').toList(), 1, 1)
        4 -> Triple(('1'..'4').toList(), 2, 2)
        8 -> Triple(('1'..'8').toList(), 2, 4)
        16 -> Triple(('1'..'9') + ('A'..'G'), 4, 4)
        else -> return false
    }

    val emptyChar = '-'
    val rowCheckers = Array(size) { BooleanArray(validChars.size + 1) }
    val colCheckers = Array(size) { BooleanArray(validChars.size + 1) }
    val boxCheckers = Array(size / subgridRows) { Array(size / subgridCols) { BooleanArray(validChars.size + 1) } }

    for (row in 0..<size) {
        for (col in 0..<size) {
            val char = board[row][col]

            if (allowEmpty && char == emptyChar) continue

            val value = validChars.indexOf(char) + 1
            if (value == 0) return false  // Invalid character

            if (rowCheckers[row][value]) return false
            rowCheckers[row][value] = true

            if (colCheckers[col][value]) return false
            colCheckers[col][value] = true

            val boxRow = row / subgridRows
            val boxCol = col / subgridCols
            if (boxCheckers[boxRow][boxCol][value]) return false
            boxCheckers[boxRow][boxCol][value] = true
        }
    }
    return true
}