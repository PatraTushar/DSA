package BitManipulation.Basics;

public class Q7 {

    static int toggleIthBit(int n,int i){

        //  Time Complexity: O(1)
        //  Space Complexity: O(1)


        return (n^(1<<i));
    }

    public static void main(String[] args) {

        int n=13;
        int i=2;
        System.out.println(toggleIthBit(n,i));
        System.out.println(toggleIthBit(n,1));
    }
}
