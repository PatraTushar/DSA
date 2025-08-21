package BitManipulation.Basics;

public class Q10 {

    static int countTheNumberOfSetBits(int n){

        //  Time Complexity: O(log n)
        //  Space Complexity: O(1)

        int count=0;

        while (n>0){


            if(n%2!=0) count++;

            n=n/2;
        }

        return count;
    }

    static int countTheNumberOfSetBitsI(int n){

        //  Time Complexity: O(log n)
        //  Space Complexity: O(1)

        int count=0;

        while (n>0){


            if((n&1)!=0) count++;

            n=n>>1;
        }

        return count;
    }


    static int countTheNumberOfSetBitsII(int n){

        //  Time Complexity: O(k)  where k is the number of set bits
        //  Space Complexity: O(1)

        int count=0;

        while (n>0){

            n=n & (n-1);
            count++;

        }

        return count;
    }




    public static void main(String[] args) {

        int n=16;
        System.out.println(countTheNumberOfSetBits(n));
        System.out.println(countTheNumberOfSetBits(13));
        System.out.println(countTheNumberOfSetBitsI(n));
        System.out.println(countTheNumberOfSetBitsI(13));
        System.out.println(countTheNumberOfSetBitsII(n));
        System.out.println(countTheNumberOfSetBitsII(13));


    }
}
