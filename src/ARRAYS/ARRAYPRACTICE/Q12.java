package ARRAYS.ARRAYPRACTICE;

public class Q12 {
    static void swap(int x,int y){

        System.out.println(" original value before swapping ");
        System.out.println(" a : "  +x);
        System.out.println(" b : "  +y);

        int temp=x;
        x=y;
        y=temp;

        System.out.println(" value after swapping ");
        System.out.println(" a :"  +x);
        System.out.println(" b :"  +y);



    }

    public static void main(String[] args) {

        int a=10;
        int b=20;
     //   int arr[]=new int[1];

        swap(a,b);




    }
}
