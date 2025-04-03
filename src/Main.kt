//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


fun main() {

    val sudoku3x3 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(2, 3, 1),
        intArrayOf(3, 1, 2)
    )

    val sudoku4x4 = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(3, 4, 1, 2),
        intArrayOf(2, 1, 4, 3),
        intArrayOf(4, 3, 2, 1)
    )

    val sudoku8x8 = arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6, 7, 8),
        intArrayOf(5, 6, 7, 8, 1, 2, 3, 4),
        intArrayOf(2, 1, 4, 3, 6, 5, 8, 7),
        intArrayOf(6, 5, 8, 7, 2, 1, 4, 3),
        intArrayOf(3, 4, 1, 2, 7, 8, 5, 6),
        intArrayOf(7, 8, 5, 6, 3, 4, 1, 2),
        intArrayOf(4, 3, 2, 1, 8, 7, 6, 5),
        intArrayOf(8, 7, 6, 5, 4, 3, 2, 1)
    )
    val sudoku16x16 = arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16),
        intArrayOf(5, 6, 7, 8, 1, 2, 3, 4, 13, 14, 15, 16, 9, 10, 11, 12),
        intArrayOf(9, 10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8),
        intArrayOf(13, 14, 15, 16, 9, 10, 11, 12, 5, 6, 7, 8, 1, 2, 3, 4),
        intArrayOf(2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15),
        intArrayOf(6, 5, 8, 7, 2, 1, 4, 3, 14, 13, 16, 15, 10, 9, 12, 11),
        intArrayOf(10, 9, 12, 11, 14, 13, 16, 15, 2, 1, 4, 3, 6, 5, 8, 7),
        intArrayOf(14, 13, 16, 15, 10, 9, 12, 11, 6, 5, 8, 7, 2, 1, 4, 3),
        intArrayOf(3, 4, 1, 2, 7, 8, 5, 6, 11, 12, 9, 10, 15, 16, 13, 14),
        intArrayOf(7, 8, 5, 6, 3, 4, 1, 2, 15, 16, 13, 14, 11, 12, 9, 10),
        intArrayOf(11, 12, 9, 10, 15, 16, 13, 14, 3, 4, 1, 2, 7, 8, 5, 6),
        intArrayOf(15, 16, 13, 14, 11, 12, 9, 10, 7, 8, 5, 6, 3, 4, 1, 2),
        intArrayOf(4, 3, 2, 1, 8, 7, 6, 5, 12, 11, 10, 9, 16, 15, 14, 13),
        intArrayOf(8, 7, 6, 5, 4, 3, 2, 1, 16, 15, 14, 13, 12, 11, 10, 9),
        intArrayOf(12, 11, 10, 9, 16, 15, 14, 13, 4, 3, 2, 1, 8, 7, 6, 5),
        intArrayOf(16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    )

    val invalid4x4 = arrayOf(
        intArrayOf(1, 2, 3, 5),
        intArrayOf(3, 4, 1, 2),
        intArrayOf(2, 1, 4, 3),
        intArrayOf(4, 3, 2, 1)
    )

    val invalid8x8 = arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6, 7, 8),
        intArrayOf(5, 6, 7, 8, 1, 2, 3, 4),
        intArrayOf(2, 1, 4, 3, 6, 5, 8, 7),
        intArrayOf(6, 5, 8, 7, 2, 1, 4, 3),
        intArrayOf(3, 4, 1, 1, 7, 8, 5, 6),
        intArrayOf(7, 8, 5, 6, 3, 4, 1, 2),
        intArrayOf(4, 3, 2, 1, 8, 7, 6, 5),
        intArrayOf(8, 7, 6, 5, 4, 3, 2, 1)
    )

    val invalid16x16 = arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16),
        intArrayOf(1, 6, 7, 8, 2, 3, 4, 5,13,14,15,16, 9,10,11,12),
        intArrayOf(9,10,11,12,13,14,15,16, 1, 2, 3, 4, 5, 6, 7, 8),
        intArrayOf(13,14,15,16, 9,10,11,12, 5, 6, 7, 8, 1, 2, 3, 4),
        intArrayOf(2, 1, 4, 3, 6, 5, 8, 7,10, 9,12,11,14,13,16,15),
        intArrayOf(6, 5, 8, 7, 2, 1, 4, 3,14,13,16,15,10, 9,12,11),
        intArrayOf(10, 9,12,11,14,13,16,15, 2, 1, 4, 3, 6, 5, 8, 7),
        intArrayOf(14,13,16,15,10, 9,12,11, 6, 5, 8, 7, 2, 1, 4, 3),
        intArrayOf(3, 4, 1, 2, 7, 8, 5, 6,11,12, 9,10,15,16,13,14),
        intArrayOf(7, 8, 5, 6, 3, 4, 1, 2,15,16,13,14,11,12, 9,10),
        intArrayOf(11,12, 9,10,15,16,13,14, 3, 4, 1, 2, 7, 8, 5, 6),
        intArrayOf(15,16,13,14,11,12, 9,10, 7, 8, 5, 6, 3, 4, 1, 2),
        intArrayOf(4, 3, 2, 1, 8, 7, 6, 5,12,11,10, 9,16,15,14,13),
        intArrayOf(8, 7, 6, 5, 4, 3, 2, 1,16,15,14,13,12,11,10, 9),
        intArrayOf(12,11,10, 9,16,15,14,13, 4, 3, 2, 1, 8, 7, 6, 5),
        intArrayOf(16,15,14,13,12,11,10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    )

    check(
        name = "when sudoku 1 2 3 4 5 6 7 8\n" +
                "5 6 7 8 1 2 3 4\n" +
                "2 1 4 3 6 5 8 7\n" +
                "6 5 8 7 2 1 4 3\n" +
                "3 4 1 2 7 8 5 6\n" +
                "7 8 5 6 3 4 1 2\n" +
                "4 3 2 1 8 7 6 5\n" +
                "8 7 6 5 4 3 2 1",
        correctResult = true,
        result = isSudokuValid(sudoku8x8)
    )

    check(
        name = "when sudoku 1 2 3\n" +
                "2 3 1\n" +
                "3 1 2",
        correctResult = true,
        result = isSudokuValid(sudoku3x3)
    )
    check(
        name = "when sudoku 1 2 3 4\n" +
                "3 4 1 2\n" +
                "2 1 4 3\n" +
                "4 3 2 1",
        correctResult = true,
        result = isSudokuValid(sudoku4x4)
    )
    check(
        name = "when sudoku  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16\n" +
                " 5  6  7  8  1  2  3  4 13 14 15 16  9 10 11 12\n" +
                " 9 10 11 12 13 14 15 16  1  2  3  4  5  6  7  8\n" +
                "13 14 15 16  9 10 11 12  5  6  7  8  1  2  3  4\n" +
                " 2  1  4  3  6  5  8  7 10  9 12 11 14 13 16 15\n" +
                " 6  5  8  7  2  1  4  3 14 13 16 15 10  9 12 11\n" +
                "10  9 12 11 14 13 16 15  2  1  4  3  6  5  8  7\n" +
                "14 13 16 15 10  9 12 11  6  5  8  7  2  1  4  3\n" +
                " 3  4  1  2  7  8  5  6 11 12  9 10 15 16 13 14\n" +
                " 7  8  5  6  3  4  1  2 15 16 13 14 11 12  9 10\n" +
                "11 12  9 10 15 16 13 14  3  4  1  2  7  8  5  6\n" +
                "15 16 13 14 11 12  9 10  7  8  5  6  3  4  1  2\n" +
                " 4  3  2  1  8  7  6  5 12 11 10  9 16 15 14 13\n" +
                " 8  7  6  5  4  3  2  1 16 15 14 13 12 11 10  9\n" +
                "12 11 10  9 16 15 14 13  4  3  2  1  8  7  6  5\n" +
                "16 15 14 13 12 11 10  9  8  7  6  5  4  3  2  1",
        correctResult = true,
        result = isSudokuValid(sudoku16x16)
    )
    check(
        name = "when sudoku 1 2 3 5\n" +
                "3 4 1 2\n" +
                "2 1 4 3\n" +
                "4 3 2 1\n",
        correctResult = false,
        result = isSudokuValid(invalid4x4)
    )
    check(
        name = "when []",
        correctResult = false,
        result = isSudokuValid(emptyArray())
    )
    check(
        name = "when sudoku 1 2 3 4 5 6 7 8\n" +
                "5 6 7 8 1 2 3 4\n" +
                "2 1 4 3 6 5 8 7\n" +
                "6 5 8 7 2 1 4 3\n" +
                "3 4 1 1 7 8 5 6\n" +
                "7 8 5 6 3 4 1 2\n" +
                "4 3 2 1 8 7 6 5\n" +
                "8 7 6 5 4 3 2 1",
        correctResult = false,
        result = isSudokuValid(invalid8x8)
    )
    check(
        name = "when sudoku  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16\n" +
                " 1  6  7  8  2  3  4  5 13 14 15 16  9 10 11 12\n" +
                " 9 10 11 12 13 14 15 16  1  2  3  4  5  6  7  8\n" +
                "13 14 15 16  9 10 11 12  5  6  7  8  1  2  3  4\n" +
                " 2  1  4  3  6  5  8  7 10  9 12 11 14 13 16 15\n" +
                " 6  5  8  7  2  1  4  3 14 13 16 15 10  9 12 11\n" +
                "10  9 12 11 14 13 16 15  2  1  4  3  6  5  8  7\n" +
                "14 13 16 15 10  9 12 11  6  5  8  7  2  1  4  3\n" +
                " 3  4  1  2  7  8  5  6 11 12  9 10 15 16 13 14\n" +
                " 7  8  5  6  3  4  1  2 15 16 13 14 11 12  9 10\n" +
                "11 12  9 10 15 16 13 14  3  4  1  2  7  8  5  6\n" +
                "15 16 13 14 11 12  9 10  7  8  5  6  3  4  1  2\n" +
                " 4  3  2  1  8  7  6  5 12 11 10  9 16 15 14 13\n" +
                " 8  7  6  5  4  3  2  1 16 15 14 13 12 11 10  9\n" +
                "12 11 10  9 16 15 14 13  4  3  2  1  8  7  6  5\n" +
                "16 15 14 13 12 11 10  9  8  7  6  5  4  3  2  1",
        correctResult = false,
        result = isSudokuValid(invalid16x16)
    )
}

fun isSudokuValid(list : Array<IntArray>): Boolean{
    return false
}

fun check(name: String, result: Boolean, correctResult: Boolean){
    if(result == correctResult){
        println("Success -> $name".withGreenColor())
    }
    else {
        println("Fail -> $name".withRedColor())

    }
}
fun String.withGreenColor(): String = "\u001B[32m $this \u001B[0m"
fun String.withRedColor(): String = "\u001B[31m $this \u001B[0m"
