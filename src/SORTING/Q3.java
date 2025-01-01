package SORTING;

public class Q3 {

    static void displayArr(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void sortarray(int arr[]){
        int n=arr.length;

        int x=-1,y=-1;

        for(int i=1;i<n;i++){

            if(arr[i-1]>arr[i]){

                if(x==-1){
                    x=i-1;
                    y=i;
                }

                else{
                    y=i;
                }
            }


        }

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {

        int arr[]={3,8,6,7,5,9,10};


        System.out.println(" before sorting ");
        displayArr(arr);
        System.out.println();

        sortarray(arr);

        System.out.println(" after sorting ");
        displayArr(arr);





    }
}
