package ArraysbyStriver.binarySearchPattern;

public class Q15 {

    static int findMax(int[] arr){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    static int sumOfArr(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static int requiredPainter(int[] arr,int mid){

        int painter=1;
        int totalPaint=0;

        for(int i=0;i<arr.length;i++){

            if(totalPaint+arr[i]<=mid){
                totalPaint+=arr[i];
            }
            else {
                painter++;
                totalPaint=arr[i];
            }
        }

        return painter;

    }


    static int PainterPartition(int[] arr,int PaintersAllowed){

        int start=findMax(arr);
        int end=sumOfArr(arr);

        while (start<=end){

            int mid=start+(end-start)/2;

            int totalPainters=requiredPainter(arr,mid);

            if(totalPainters>PaintersAllowed){
                start=mid+1;

            }

            else {
                end=mid-1;
            }


        }

        return start;


    }

    public static void main(String[] args) {

        // Painter Partition Problem

        int[] arr={10,20,10,10};
        int PainterAllowed=2;
        System.out.println(PainterPartition(arr,PainterAllowed));
    }
}
