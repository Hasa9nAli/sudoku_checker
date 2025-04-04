import utils.*


fun main() {


    check(
        name = VALID_3x3,
        correctResult = true,
        result = isSudokuValid(sudoku3x3)
    )

    check(
        name = VALID_4x4,
        correctResult = true,
        result = isSudokuValid(sudoku4x4)
    )
    check(
        name = VALID_4x4_1,
        correctResult = true,
        result = isSudokuValid(sudoku4x4_1)
    )

    check(
        name = VALID_8x8,
        correctResult = true,
        result = isSudokuValid(sudoku8x8)
    )

    check(
        name = VALID_16x16,
        correctResult = true,
        result = isSudokuValid(sudoku16x16)
    )

    check(
        name = INVALID_4x4,
        correctResult = false,
        result = isSudokuValid(invalid4x4)
    )
    check(
        name = EMPTY,
        correctResult = true,
        result = isSudokuValid(empty)
    )

    check(
        name = EMPTY_LIST,
        correctResult = true,
        result = isSudokuValid(empty)
    )

    check(
        name = INVALID_8x8,
        correctResult = false,
        result = isSudokuValid(invalid8x8)
    )

    check(
        name = INVALID_16x16,
        correctResult = false,
        result = isSudokuValid(invalid16x16)
    )

    check(
        name = INVALID_3x4,
        correctResult = false,
        result = isSudokuValid(invalid3x4)
    )

    check(
        name = INVALID_8x7,
        correctResult = false,
        result = isSudokuValid(invalid8x7)
    )
}

