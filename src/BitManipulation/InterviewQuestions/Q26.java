package BitManipulation.InterviewQuestions;

public class Q26 {


    static long minEnd(int n, int x) {


        // Time Complexity : O(n)
        // Space Complexity : O(1)


        long ans = x;

        for (int i = 1; i < n; i++) {

            ans = (ans + 1) | x;
        }

        return ans;
    }

    public static void main(String[] args) {

        // leeTCode->3133

        int n = 3;
        int x = 4;
        System.out.println(minEnd(n, x));
    }
}
