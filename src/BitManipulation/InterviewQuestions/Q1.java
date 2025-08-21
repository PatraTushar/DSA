package BitManipulation.InterviewQuestions;

public class Q1 {


    static int minimumFlips(int start, int goal) {

        //  Time Complexity: O(k)  where k is the number of set bits in ans
        //  Space Complexity: O(1)

        int ans = start ^ goal;
        int count=0;

        while (ans > 0) {

            ans=ans & (ans-1);
            count++;

        }

        return count;
    }

    public static void main(String[] args) {

        int start = 0;
        int goal = 7;
        System.out.println(minimumFlips(start,goal));
    }
}
