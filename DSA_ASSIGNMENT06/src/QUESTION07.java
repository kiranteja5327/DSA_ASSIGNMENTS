/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

**Example 1:**
**Input:** n = 3

**Output:** [[1,2,3],[8,9,4],[7,6,5]]
 */
public class QUESTION07 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // Start with element 1
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while (num <= n * n) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            
            // Fill right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            
            // Fill bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
            
            // Fill left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        
        return matrix;
    }
    
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        
        // Print the generated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
