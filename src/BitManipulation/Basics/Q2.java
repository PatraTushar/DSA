package BitManipulation.Basics;

public class Q2 {


    static int binaryToDecimal(String s){

        //  Time Complexity:O(n)
        //  Space Complexity: O(1)

        int n=s.length();
        int result=0;
        int pointer=0;

        for (int i=n-1;i>=0;i--){

            int number=s.charAt(i)-'0';

            result+=Math.pow(2,pointer)*number;

            pointer++;



        }

        return result;
    }

    public static void main(String[] args) {


        // CONVERT BINARY TO DECIMAL

        String s="1101";
        System.out.println(binaryToDecimal(s));
    }
}
