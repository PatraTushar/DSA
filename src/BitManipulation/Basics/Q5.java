package BitManipulation.Basics;

public class Q5 {

    static int setTheIthBit(int n,int i){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)

        return (n | (1<<i));
    }

    public static void main(String[] args) {

        // SET THE ITH BIT

        int n=9;
        int i=2;
        System.out.println(setTheIthBit(n,i));
    }
}
