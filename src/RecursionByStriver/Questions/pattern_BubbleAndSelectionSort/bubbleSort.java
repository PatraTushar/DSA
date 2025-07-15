package RecursionByStriver.Questions.pattern_BubbleAndSelectionSort;

public class bubbleSort {

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

//    static void sort(int[] arr){
//
//        for(int i=0;i<arr.length-1;i++){
//
//            boolean flag=false;
//
//            for(int j=0;j<arr.length-i-1;j++){
//
//                if(arr[j]>arr[j+1]){
//                    swap(arr,j,j+1);
//                    flag=true;
//                }
//
//
//            }
//
//            if(!flag) return;
//
//        }
//
//        System.out.println();;
//
//
//    }

    static void bubbleSortUsingRecursion(int[] arr,int n){

      if(n==1) return;

      for (int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
              swap(arr,i,i+1);
          }
      }

      bubbleSortUsingRecursion(arr,n-1);

    }

    static void printArr(int[] arr){

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr={5,4,2,3,1};
        int n=arr.length;
        printArr(arr);

        bubbleSortUsingRecursion(arr,n);
        printArr(arr);


//        int[] arr={5,4,2,3,1};
//
//        System.out.println(" before sorting ");
//        System.out.println(Arrays.toString(arr));
//
//        sort(arr);
//
//        System.out.println(" after sorting ");
//        System.out.println(Arrays.toString(arr));
    }
}
