public class Solution {

    private static boolean isMagicSquare(int[][] grid, int row, int col) {
        int[] count = new int[10];  // To track the occurrence of numbers 1-9
        int sum = 0;
        int diagonal1 = 0, diagonal2 = 0;
        // Check each row, column, and diagonal sum
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                int num = grid[row + i][col + j];

                // if the number is within the range 1-9
                if (num < 1 || num > 9) {
                    return false;
                }

                // Track the occurrence of the number
                count[num]++;
                if (count[num] > 1) {
                    return false; // If a number appears more than once, it's not a magic square
                }

                rowSum += num;
                colSum += grid[row + j][col + i];
                sum += num;

                if (i == j) diagonal1 += num;
                if (i + j == 2) diagonal2 += num;
            }
            if (rowSum != 15 || colSum != 15) return false;
        }

        // The sum of all numbers must be 45, and the diagonals must sum to 15
        return sum == 45 && diagonal1 == 15 && diagonal2 == 15;
    }

    // Static method to count all 3x3 magic squares in the grid
    public static int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        // Loop over every possible 3x3 subgrid
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}