import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;

    @Test
    public void testIndexOfFirstNonZero() {
        int[][] matrix = {
                {  0,   0,   0,   0,   0},
                {  0,   0,   0, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        int[] expected = new int[]{1, 3};

        int[] actual = Matrix.indexOfFirstNonZero(matrix);

        assertEquals(2, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void testGetMinimumOfRows() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(-72);
        expected.add(-88);
        expected.add(-97);
        expected.add(-64);
        expected.add(-84);

        ArrayList<Integer> actual = Matrix.getMinimumOfRows(matrix);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}