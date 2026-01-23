package Recursion.CodeWithMik;

public class Q36 {

    static int[] dRows = {-1, 0, 1, 0};
    static int[] dCols = {0, -1, 0, 1};

    static int helper(int[][] grid, int row, int col) {


        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) return 0;

        int currentGold = grid[row][col];
        grid[row][col] = 0;


        int maxGold = 0;

        for (int i = 0; i < 4; i++) {

            int newRow = row + dRows[i];
            int newCol = col + dCols[i];

            int collected = helper(grid, newRow, newCol);
            maxGold=Math.max(maxGold,collected);




        }

        grid[row][col]=currentGold;

        return maxGold+currentGold;


    }

    static int getMaximumGold(int[][] grid) {

        //  Time Complexity (TC): O(m *n * 4^k)
        //  Space Complexity (SC): O(k)


        int rows = grid.length;
        int cols = grid[0].length;

        int maxGold = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] != 0) {

                    int gold = helper(grid, i, j);

                    maxGold = Math.max(maxGold, gold);


                }
            }
        }


        return maxGold;
    }

    public static void main(String[] args) {

        // leeTCode->1219

        int[][] grid = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};
        System.out.println(getMaximumGold(grid));


    }
}
