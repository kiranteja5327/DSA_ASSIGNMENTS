/*
 * **Input:** original = [1,2,3,4], m = 2, n = 2

**Output:** [[1,2],[3,4]]

**Explanation:** The constructed 2D array should contain 2 rows and 2 columns.

The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.

The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.
 */
import java.util.Arrays;

public class QUESTION01 {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = construct2DArray(original, m, n);
        System.out.println(Arrays.deepToString(result));
    }
}

