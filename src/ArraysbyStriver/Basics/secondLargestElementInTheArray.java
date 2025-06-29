package ArraysbyStriver.Basics;

public class secondLargestElementInTheArray {

    static int secondLargest(int arr[]){

        int largest=arr[0];
        int secondLargest=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){

                largest=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]<largest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }

        return secondLargest;




    }

    // optimal solution

    static int SecondLargest(int arr[]){

        if(arr.length<2) return -1;

        int Largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){

            if(arr[i]>Largest){
                sLargest=Largest;
                Largest=arr[i];

            }

            else if(arr[i]>sLargest && arr[i]!=Largest){
                sLargest=arr[i];
            }


        }

        return sLargest;

    }

    static  int secondSmallest(int arr[]){

        if(arr.length<20) return -1;

        int smallest=Integer.MAX_VALUE;
        int sSmallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }

            else if(arr[i]<sSmallest && arr[i]!=smallest){
                sSmallest=arr[i];
            }


        }

        return sSmallest;
    }

    public static void main(String[] args) {

        int arr[]={1,2,4,7,7,5};
        System.out.println(" second largest is " +secondLargest(arr));

        System.out.println(SecondLargest(arr));
        System.out.println(secondSmallest(arr));

    }
}
