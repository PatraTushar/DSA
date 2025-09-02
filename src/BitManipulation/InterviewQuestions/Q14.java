package BitManipulation.InterviewQuestions;

public class Q14 {

    static int minimumOneBotOperation(int n){

        //  Time Complexity: O(log n)
        //  Space Complexity: O(1)

        int ans=0;

        while (n>0){

            ans=ans^n;
            n=n>>1;
        }

        return ans;
    }

    public static void main(String[] args) {

        // leeTCode->1611

        int n=6;
        System.out.println(minimumOneBotOperation(n));
        System.out.println(minimumOneBotOperation(45));


    }
}
