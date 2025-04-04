package utils

val sudoku3x3 = listOf(
    listOf('1', '2', '3'),
    listOf('2', '3', '1'),
    listOf('3', '1', '2')
)

val sudoku4x4 = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '4', '1', '2'),
    listOf('2', '1', '4', '3'),
    listOf('4', '3', '2', '1')
)

val sudoku4x4_1 = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '4', '-', '2'),
    listOf('2', '-', '4', '3'),
    listOf('4', '3', '2', '1')
)

val sudoku8x8 = listOf(
    listOf('1', '2', '3', '4', '5', '6', '7', '8'),
    listOf('5', '6', '7', '8', '1', '2', '3', '4'),
    listOf('2', '1', '4', '3', '6', '5', '8', '7'),
    listOf('6', '5', '8', '7', '2', '1', '4', '3'),
    listOf('3', '4', '1', '2', '7', '8', '5', '6'),
    listOf('7', '8', '5', '6', '3', '4', '1', '2'),
    listOf('4', '3', '2', '1', '8', '7', '6', '5'),
    listOf('8', '7', '6', '5', '4', '3', '2', '1')
)

val sudoku16x16 = listOf(
    listOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
    listOf('5', '6', '7', '8', '1', '2', '3', '4', 'D', 'E', 'F', 'G', '9', 'A', 'B', 'C'),
    listOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
    listOf('D', 'E', 'F', 'G', '9', 'A', 'B', 'C', '5', '6', '7', '8', '1', '2', '3', '4'),
    listOf('2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F'),
    listOf('6', '5', '8', '7', '2', '1', '4', '3', 'E', 'D', 'G', 'F', 'A', '9', 'C', 'B'),
    listOf('A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7'),
    listOf('E', 'D', 'G', 'F', 'A', '9', 'C', 'B', '6', '5', '8', '7', '2', '1', '4', '3'),
    listOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
    listOf('7', '8', '5', '6', '3', '4', '1', '2', 'F', 'G', 'D', 'E', 'B', 'C', '9', 'A'),
    listOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
    listOf('F', 'G', 'D', 'E', 'B', 'C', '9', 'A', '7', '8', '5', '6', '3', '4', '1', '2'),
    listOf('4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D'),
    listOf('8', '7', '6', '5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', 'A', '9'),
    listOf('C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5'),
    listOf('G', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', '1')
)

// Invalid 4x4 Sudoku grid
val invalid4x4 = listOf(
    listOf('1', '2', '3', '5'),  // Invalid: Contains '5' (should only be 1-4)
    listOf('3', '4', '1', '2'),   // Top-left 2x2 subgrid [1,2,3,4] has duplicate '1's with row below
    listOf('2', '1', '4', '3'),   // Conflicts with first row in column 1 (two '2's)
    listOf('4', '3', '2', '1')    // Conflicts with first row in column 4 (two '1's)
)

// Invalid 8x8 Sudoku-like grid
val invalid8x8 = listOf(
    listOf('1', '2', '3', '4', '5', '6', '7', '8'),
    listOf('5', '6', '7', '8', '1', '2', '3', '4'),
    listOf('2', '1', '4', '3', '6', '5', '8', '7'),
    listOf('6', '5', '8', '7', '2', '1', '4', '3'),
    listOf('3', '4', '1', '1', '7', '8', '5', '6'),  // Invalid: Duplicate '1's in this row (columns 3 & 4)
    listOf('7', '8', '5', '6', '3', '4', '1', '2'),
    listOf('4', '3', '2', '1', '8', '7', '6', '5'),
    listOf('8', '7', '6', '5', '4', '3', '2', '1')   // Subgrid violation in bottom-right 2x2 area
)

// Invalid 16x16 Sudoku-like grid
val invalid16x16 = listOf(
    listOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
    listOf('1', '6', '7', '8', '2', '3', '4', '5', 'D', 'E', 'F', 'G', '9', 'A', 'B', 'C'),  // Invalid: Duplicate '1' in first column
    listOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
    listOf('D', 'E', 'F', 'G', '9', 'A', 'B', 'C', '5', '6', '7', '8', '1', '2', '3', '4'),
    listOf('2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F'),
    listOf('6', '5', '8', '7', '2', '1', '4', '3', 'E', 'D', 'G', 'F', 'A', '9', 'C', 'B'),
    listOf('A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7'),
    listOf('E', 'D', 'G', 'F', 'A', '9', 'C', 'B', '6', '5', '8', '7', '2', '1', '4', '3'),
    listOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
    listOf('7', '8', '5', '6', '3', '4', '1', '2', 'F', 'G', 'D', 'E', 'B', 'C', '9', 'A'),
    listOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
    listOf('F', 'G', 'D', 'E', 'B', 'C', '9', 'A', '7', '8', '5', '6', '3', '4', '1', '2'),
    listOf('4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D'),
    listOf('8', '7', '6', '5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', 'A', '9'),
    listOf('C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5'),
    listOf('G', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', '1')  // Subgrid violations throughout
)

// Invalid 3x4 grid (not square)
val invalid3x4 = listOf(
    listOf('1', '2', '3', '4'),  // Invalid: Grid isn't square (3 rows × 4 columns)
    listOf('2', '3', '4', '1'),  // Numbers go up to 4 despite having only 3 rows
    listOf('3', '4', '1', '2')   // Latin squares/Sudoku require N×N grids
)

// Invalid 8x7 grid (not square)
val invalid8x7 = listOf(
    listOf('1', '2', '3', '4', '5', '6', '7'),  // Invalid: Grid isn't square (8 rows × 7 columns)
    listOf('2', '3', '4', '5', '6', '7', '1'),  // Last row introduces '8' which shouldn't be in 7-column grid
    listOf('3', '4', '5', '6', '7', '1', '2'),
    listOf('4', '5', '6', '7', '1', '2', '3'),
    listOf('5', '6', '7', '1', '2', '3', '4'),
    listOf('6', '7', '1', '2', '3', '4', '5'),
    listOf('7', '1', '2', '3', '4', '5', '6'),
    listOf('8', '2', '3', '4', '5', '6', '7')   // Contains '8' which exceeds expected range (1-7)
)

val empty = listOf(
    listOf('-', '-', '-', '-'),
    listOf('-', '-', '-', '-'),
    listOf('-', '-', '-', '-'),
    listOf('-', '-', '-', '-')
)