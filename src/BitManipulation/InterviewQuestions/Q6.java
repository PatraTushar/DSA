package BitManipulation.InterviewQuestions;

public class Q6 {

    static int xorOfNumberN(int n) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        int ans = 0;

        while (n >= 1) {

            ans ^= n;
            n--;
        }

        return ans;
    }


    static int xorOfNumberNI(int n) {

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)



        if (n % 4 == 1) return  1;

        else if (n % 4 == 2) return n + 1;

        else if (n % 4 == 3) return  0;

       return n;



    }


    static int xorFromLToR(int left,int right){

        //  Time Complexity: O(right-left+1)
        //  Space Complexity: O(1)


        int ans=0;

      for(int i=left;i<=right;i++){

          ans^=i;
      }
        return ans;
    }

    static int xorFromLeftToR1(int left,int right){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)

        return xorOfNumberNI(left-1)^xorOfNumberNI(right);
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println(xorOfNumberN(n));
        System.out.println(xorOfNumberNI(n));
        System.out.println(xorFromLToR(4,7));
        System.out.println(xorFromLeftToR1(4,7));


    }
}
