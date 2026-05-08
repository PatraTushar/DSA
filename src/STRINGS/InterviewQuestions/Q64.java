package STRINGS.InterviewQuestions;

public class Q64 {

    static int countCollisions(String directions) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int n = directions.length();

        int i = 0;
        int j = n - 1;

        while (i < n && directions.charAt(i) == 'L') {
            i++;
        }

        while (j >= 0 && directions.charAt(j) == 'R') {
            j--;
        }

        int collisions = 0;

        while (i <= j) {

            if (directions.charAt(i) != 'S') {

                collisions++;
            }

            i++;


        }

        return collisions;


    }

    public static void main(String[] args) {

        // leeTCode->2211

        String directions = "RLRSLL";
        System.out.println(countCollisions(directions));

    }
}
