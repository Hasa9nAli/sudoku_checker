package utils

object TestCases {
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

    val invalid3x4 = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(2, 3, 4, 1),
        intArrayOf(3, 4, 1, 2)
    )

    val invalid8x7 = arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6, 7),
        intArrayOf(2, 3, 4, 5, 6, 7, 1),
        intArrayOf(3, 4, 5, 6, 7, 1, 2),
        intArrayOf(4, 5, 6, 7, 1, 2, 3),
        intArrayOf(5, 6, 7, 1, 2, 3, 4),
        intArrayOf(6, 7, 1, 2, 3, 4, 5),
        intArrayOf(7, 1, 2, 3, 4, 5, 6),
        intArrayOf(8, 2, 3, 4, 5, 6, 7),
        )

}