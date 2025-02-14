package ARRAYS;
public class ArrayReference {

    static void printArray(int arr[]){

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;

        System.out.println("original array");
        printArray(arr);


        int[] array_2=arr;
        System.out.println("copied array");
        printArray(array_2);

        //changing some values of array_2

        array_2[0]=0;
        array_2[1]=0;

        System.out.println("original array after changing array_2" );
        printArray(arr);

        System.out.println("copied array_2 after changing array_2");
        printArray(array_2);





    }
}
