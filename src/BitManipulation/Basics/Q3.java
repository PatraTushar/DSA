package BitManipulation.Basics;

public class Q3 {

    static void swap(int a,int b){

        System.out.println(" BEFORE SWAPPING "+a +" : "+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(" AFTER SWAPPING "+a +" : "+b);


    }

    public static void main(String[] args) {

        // SWAP 2 NUMBERS WITHOUT USING THIRD VARIABLE



        swap(6,5);

    }
}
