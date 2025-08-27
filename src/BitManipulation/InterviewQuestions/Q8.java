package BitManipulation.InterviewQuestions;

public class Q8 {


    static int minFlips(int a, int b, int c) {

        // Time Complexity: O(32)
        // Space Complexity: O(1)

        int flips = 0;


        while (a != 0 || b != 0 || c != 0) {

            int aBit = a & 1;
            int bBit = b & 1;
            int cBit=c&1;

            if(cBit==1){

                if(aBit==0 && bBit==0) flips++;


            }

            else {

                if(aBit==1) flips++;
                if(bBit==1) flips++;
            }

            a=a>>1;
            b=b>>1;
            c=c>>1;
        }

        return flips;
    }

    public static void main(String[] args) {

        // leeTCode->1318

        int a = 2;
        int b = 6;
        int c = 5;

        System.out.println(minFlips(a, b, c));
    }
}
