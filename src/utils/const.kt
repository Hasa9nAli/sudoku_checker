package utils

const val VALID_3x3 = "when sudoku 1 2 3\n" +
                                  "2 3 1\n" +
                                  "3 1 2"

const val VALID_4x4 = "when sudoku 1 2 3 4\n" +
                                  "3 4 1 2\n" +
                                  "2 1 4 3\n" +
                                  "4 3 2 1"

const val VALID_4x4_1 = "when sudoku - 2 3 4\n" +
                                    "3 4 - 2\n" +
                                    "2 - 4 3\n" +
                                    "4 3 2 1"

const val INVALID_4x4 = "when sudoku 1 2 3 5\n" +
                                    "3 4 1 2\n" +
                                    "2 1 4 3\n" +
                                    "4 3 2 1\n"

const val VALID_8x8 = "when sudoku 1 2 3 4 5 6 7 8\n" +
                                  "5 6 7 8 1 2 3 4\n" +
                                  "2 1 4 3 6 5 8 7\n" +
                                  "6 5 8 7 2 1 4 3\n" +
                                  "3 4 1 2 7 8 5 6\n" +
                                  "7 8 5 6 3 4 1 2\n" +
                                  "4 3 2 1 8 7 6 5\n" +
                                  "8 7 6 5 4 3 2 1"

const val INVALID_8x8 = "when sudoku 1 2 3 4 5 6 7 8\n" +
                                    "5 6 7 8 1 2 3 4\n" +
                                    "2 1 4 3 6 5 8 7\n" +
                                    "6 5 8 7 2 1 4 3\n" +
                                    "3 4 1 1 7 8 5 6\n" +
                                    "7 8 5 6 3 4 1 2\n" +
                                    "4 3 2 1 8 7 6 5\n" +
                                    "8 7 6 5 4 3 2 1"

const val VALID_16x16 = "when sudoku  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16\n" +
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
                                    "16 15 14 13 12 11 10  9  8  7  6  5  4  3  2  1"


const val INVALID_16x16 = "when sudoku  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16\n" +
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
                                      "16 15 14 13 12 11 10  9  8  7  6  5  4  3  2  1"

const val INVALID_3x4 = "when sudoku 1 2 3 4\n" +
                                    "2 3 4 1\n" +
                                    "3 4 1 2"

const val EMPTY = "when sudoku       - - - -\n" +
                                    "- - - -\n" +
                                    "- - - -"

const val INVALID_8x7 = "when sudoku 1 2 3 4 5 6 7\n" +
                                    "2 3 4 5 6 7 1\n" +
                                    "3 4 5 6 7 1 2\n" +
                                    "4 5 6 7 1 2 3\n" +
                                    "5 6 7 1 2 3 4\n" +
                                    "6 7 1 2 3 4 5\n" +
                                    "7 1 2 3 4 5 6\n" +
                                    "8 2 3 4 5 6 7"
const val EMPTY_LIST = "when []"

