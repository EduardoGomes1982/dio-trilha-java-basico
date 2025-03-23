package model;

public class Solver {

    private int solutionCount = 0;

    public boolean solve(Board board) {
        int[][] grid = board.getBoard();
        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++)
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++)
                        if (board.isValidMove(row, col, num)) {
                            grid[row][col] = num;
                            if (solve(board)) {
                                return true;
                            }
                            grid[row][col] = 0;
                        }
                    return false;
                }
        return true;
    }

    public int countSolutions(Board board) {
        solutionCount = 0;
        countSolutionsHelper(board);
        return solutionCount;
    }

    private void countSolutionsHelper(Board board) {
        int[][] grid = board.getBoard();

        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++)
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++)
                        if (board.isValidMove(row, col, num)) {
                            grid[row][col] = num;
                            if (solutionCount > 1)
                                return;
                            countSolutionsHelper(board);
                            grid[row][col] = 0;
                        }
                    return;
                }
        solutionCount++;
    }

}
