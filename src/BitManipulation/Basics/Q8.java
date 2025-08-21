package BitManipulation.Basics;

public class Q8 {

    static int removeTheLastSetBit(int n){

        return  (n & (n-1)) ;
    }

    public static void main(String[] args) {

        // REMOVE THE LAST SET BIT

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)


        int n=84;
        System.out.println(removeTheLastSetBit(n));
        System.out.println(removeTheLastSetBit(40));
    }
}
