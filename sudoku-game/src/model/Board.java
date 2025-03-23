package model;

import java.util.Random;

public class Board {

    private final int[][] board = new int[9][9];

    public void generateBoard() {
        Random random = new Random();
        clearBoard();
        int cellsToFill = 25; // Por exemplo, preenche 25 células aleatórias
        for (int i = 0; i < cellsToFill; i++) {
            int row, col, num;
            do {
                row = random.nextInt(9);
                col = random.nextInt(9);
                num = random.nextInt(9) + 1;
            } while (board[row][col] != 0 || !isValidMove(row, col, num));

            board[row][col] = num;
        }
        Solver solver = new Solver();
        while (solver.countSolutions(this) != 1) {
            generateBoard();
        }
    }

    private void clearBoard() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col] = 0;
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public void displayBoard() {
        for (int[] row : board) {
            for (int num : row)
                System.out.print((num == 0 ? "." : num) + " ");
            System.out.println();
        }
    }

    public boolean isValidMove(int row, int col, int num) {
        for (int i = 0; i < 9; i++)
            if (board[row][i] == num)
                return false;
        for (int i = 0; i < 9; i++)
            if (board[i][col] == num)
                return false;
        int startRow = row / 3 * 3, startCol = col / 3 * 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[startRow + i][startCol + j] == num)
                    return false;
        return true;
    }

}
