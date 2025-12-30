package Recursion.CodeWithMik;

public class Q28 {


    static int[] dRows = {-1, 0, 1, 0};
    static int[] dCols = {0, -1, 0, 1};

    static int backtrack(int[][] grid, int x, int y, int nonObstacle, int count) {

        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == -1) return 0;

        if (grid[x][y] == 2) {

            return count == nonObstacle ? 1 : 0;
        }


        int temp = grid[x][y];
        grid[x][y] = -1;


        int totalPaths = 0;

        for (int i = 0; i < 4; i++) {

            int newRow = x + dRows[i];
            int newCols = y + dCols[i];


            totalPaths += backtrack(grid, newRow, newCols, nonObstacle, count+1);

        }

        grid[x][y] = temp;


        return totalPaths;


    }


    static int uniquePathsIII(int[][] grid) {

        //  Time Complexity (TC): O(m×n×4^k)     m = number of rows in board      n = number of columns in board    k = number of non obstacle cell
        //  Space Complexity (SC): O(k)


        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = 0;
        int nonObstacle = 0;


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {

                    row = i;
                    col = j;
                    nonObstacle++;
                } else if (grid[i][j] == 0) nonObstacle++;
            }
        }


        return backtrack(grid, row, col, nonObstacle, 0);


    }


    public static void main(String[] args) {

        // leeTCode->980

        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(uniquePathsIII(grid));

    }
}
