import utils.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


fun main() {


    check(
        name = VALID_3x3,
        correctResult = true,
        result = isSudokuValid(TestCases.sudoku3x3)
    )

    check(
        name = VALID_4x4,
        correctResult = true,
        result = isSudokuValid(TestCases.sudoku4x4)
    )

    check(
        name = VALID_8x8,
        correctResult = true,
        result = isSudokuValid(TestCases.sudoku8x8)
    )

    check(
        name = VALID_16x16,
        correctResult = true,
        result = isSudokuValid(TestCases.sudoku16x16)
    )
    check(
        name = INVALID_4x4,
        correctResult = false,
        result = isSudokuValid(TestCases.invalid4x4)
    )
    check(
        name = EMPTY_LIST,
        correctResult = false,
        result = isSudokuValid(emptyArray())
    )
    check(
        name = INVALID_8x8,
        correctResult = false,
        result = isSudokuValid(TestCases.invalid8x8)
    )
    check(
        name = INVALID_16x16,
        correctResult = false,
        result = isSudokuValid(TestCases.invalid16x16)
    )
    check(
        name = INVALID_3x4,
        correctResult = false,
        result = isSudokuValid(TestCases.invalid3x4)
    )
    check(
        name = INVALID_8x7,
        correctResult = false,
        result = isSudokuValid(TestCases.invalid8x7)
    )
}

fun isSudokuValid(board: Array<IntArray>): Boolean{
    return false
}



