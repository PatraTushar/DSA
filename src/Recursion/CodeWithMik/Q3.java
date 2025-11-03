package Recursion.CodeWithMik;

import java.util.ArrayList;

public class Q3 {

    static int[] dRow = {0, 1, 0, -1};
    static int[] dCols = {-1, 0, 1, 0};
    static char[] direction = {'L', 'D', 'R', 'U'};

    static void solve(int[][] maze, int row, int cols, String path, ArrayList<String> result, int n) {

        if (row < 0 || cols < 0 || row >= n || cols >= n || maze[row][cols] == 0) return;

        if (row == n - 1 && cols == n - 1) {

            result.add(path);
            return;

        }


        maze[row][cols] = 0;

        for (int i = 0; i < 4; i++) {


            int nextRow = row + dRow[i];
            int nextCols = cols + dCols[i];
            solve(maze, nextRow, nextCols, path + direction[i], result, n);


        }

        maze[row][cols] = 1;


    }

    static ArrayList<String> rateInMaze(int[][] maze) {

        // Time Complexity: O(4^(n^2))
        //Space Complexity: O(n^2) (recursion + result)


        int n = maze.length;

        ArrayList<String> possiblePath = new ArrayList<>();

        if (maze[0][0] == 1) solve(maze, 0, 0, "", possiblePath, n);

        return possiblePath;


    }

    public static void main(String[] args) {

        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        System.out.println(rateInMaze(maze));

    }
}
