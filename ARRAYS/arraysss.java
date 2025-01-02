package ARRAYS;

public  class arraysss {


    static void printArray(int arr[]){

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    static void changeArray(int arr[]){

        for(int i=0;i<arr.length;i++)
            arr[i]=0;
    }

    static void changeval(int a){
         a=1004;
    }



    public static void main(String[] args) {

        int a=5;
        changeval(a);
        System.out.println(a);
        int arr[]=new int[3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;

        changeArray(arr);
        printArray(arr);

    }
}
