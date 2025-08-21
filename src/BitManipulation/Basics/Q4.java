package BitManipulation.Basics;

public class Q4 {

    static boolean checkIthBitIsSet(int n,int i){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)

        // USING LEFT SHIFT OPERATOR

        // ith bit 1=set(true)
        // ith bit 0=Not set(false)

        if((n & (1<<i))!=0) return true;

        return false;
    }

    static boolean checkIthBitIsSetI(int n,int i){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)

        // USING RIGHT SHIFT OPERATOR

        // ith bit 1=set(true)
        // ith bit 0=Not set(false)

        if(((n>>i) & 1)!=0) return true;

        return false;
    }



    public static void main(String[] args) {

        int n=13;
        int i=2;
        System.out.println(checkIthBitIsSet(n,i));
        System.out.println(checkIthBitIsSetI(n,1));


    }
}
