import java.util.ArrayList;
import java.util.List;

public class myPractice {


    static char[] direction = {'U', 'L', 'D', 'R'};
    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, -1, 0, 1};

    static void rateInAMaze(int n, int[][] maze, int rows, int cols, String path, List<String> result) {

        if (rows >= n || cols >= n || rows < 0 || cols < 0 || maze[rows][cols] == 0) return;

        if (rows == n - 1 && cols == n - 1) {

            result.add(path);
            return;
        }


        maze[rows][cols] = 0;


        for (int i = 0; i < 4; i++) {

            int nextRow = rows + dRow[i];
            int nextCol = cols + dCol[i];
            rateInAMaze(n, maze, nextRow, nextCol, path + direction[i], result);
        }

        maze[rows][cols] = 1;


    }

    static List<String> rateInAMaze(int[][] maze) {

        List<String> possiblePath = new ArrayList<>();

        if (maze[0][0] == 1) {
            rateInAMaze(maze.length, maze, 0, 0, "", possiblePath);

        }

        return possiblePath;

    }

    public static void main(String[] args) {

        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        System.out.println(rateInAMaze(maze));




    }


}

