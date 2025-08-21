package BitManipulation.Basics;

public class Q6 {

    static int clearTheIthBit(int n,int i){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)

        return (n & ~(1<<i));
    }

    public static void main(String[] args) {

        // CLEAR THE ITH BIT

        int n=13;
        int i=2;
        System.out.println(clearTheIthBit(n,i));
    }
}
