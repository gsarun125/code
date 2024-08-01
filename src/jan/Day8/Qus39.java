package jan.Day8;

/*
Problem 39:
Given a 5X5 chess board as input. 9 knights are placed in the board. Print whether the configuration valid or Invalid.

 */
public class Qus39 {
    public static void main(String[] args) {
        char[][] board = {
                {' ', 'K', ' ', 'K', ' '},
                {'K', ' ', ' ', ' ', 'K'},
                {' ', ' ', 'K', ' ', ' '},
                {'K', ' ', ' ', ' ', 'K'},
                {' ', 'K', ' ', 'K', ' '}
        };

        boolean result = isvalidKnightPlacement(board);
        if (result) {
            System.out.println("knight placed is valid.");
        } else {
            System.out.println("Knight placed is invalid");
        }
    }

    private static boolean isvalidKnightPlacement(char[][] board) {
        int knightCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'K') {
                    knightCount++;
                    if (isKnightAttacked(board, i - 2, j - 1) ||
                            isKnightAttacked(board, i - 2, j + 1) ||
                            isKnightAttacked(board, i - 1, j - 2) ||
                            isKnightAttacked(board, i - 1, j + 2) ||
                            isKnightAttacked(board, i + 1, j - 2) ||
                            isKnightAttacked(board, i + 1, j + 2) ||
                            isKnightAttacked(board, i + 2, j - 1) ||
                            isKnightAttacked(board, i + 2, j + 1)) {
                        System.out.println(knightCount);
                        return false;
                    }
                }
            }
        }
        System.out.println(knightCount);
        return knightCount == 9;
    }

    private static boolean isKnightAttacked(char[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board[row].length) {
            return board[row][col] == 'k';
        }
        return false;
    }
}
