package BitManipulation.InterviewQuestions;

public class Q13 {

    static int count1Bits(int n){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)

        int count=0;

        for (int i=0;i<32;i++){

            if((n&1)==1)count++;
            n=n>>1;
        }

        return count;
    }

    public static void main(String[] args) {

        // leeTCode->191

        System.out.println(count1Bits(11));
        System.out.println(count1Bits(128));

    }
}
