package BitManipulation.Basics;

public class Q9 {


    static boolean powerOf2(int n){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)

        return ((n & (n-1))==0);
    }

    public static void main(String[] args) {

        int n=32;
        System.out.println(powerOf2(n));
        System.out.println(powerOf2(21));
    }
}
