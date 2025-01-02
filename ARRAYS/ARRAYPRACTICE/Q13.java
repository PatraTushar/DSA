package ARRAYS.ARRAYPRACTICE;

public class Q13 {

    static void swapWithoutTemp(int x,int y){

        System.out.println(" before swapping ");
        System.out.println(" a : " +x);
        System.out.println(" b : " +y);

        x=x-y;        // x-->10
        y=x;          //y-->10
        y=x+y;        //y-->20

        System.out.println(" after swapping ");
        System.out.println(" a :" +x);
        System.out.println(" b :" +y);
    }

    public static void main(String[] args) {

        int a=20;
        int b=10;

        swapWithoutTemp(a,b);

    }
}
