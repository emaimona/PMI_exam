import java.util.ArrayList;

public class Matrix {

    public static int[] indexOfFirstNonZero(int[][] matrix) {
        int[] index = new int[2];
        boolean flag = false;

        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    index[0] = i;
                    index[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        return index;
    }

    public static ArrayList<Integer> getMinimumOfRows(int[][] matrix) {
        ArrayList<Integer> minRows = new ArrayList<>();
        int minimum;

        for (int i=0; i< matrix.length; i++) {
            minimum = matrix[i][0];
            for (int j=1; j< matrix[0].length; j++) {
                if (matrix[i][j] < minimum) {
                    minimum = matrix[i][j];
                }
            }
            minRows.add(minimum);
        }
        return minRows;
    }
}
