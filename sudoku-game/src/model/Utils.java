package model;

public class Utils {

    public static boolean isBoardComplete(int[][] board) {
        for (int[] row : board)
            for (int num : row)
                if (num == 0)
                    return false;
        return true;
    }

}
