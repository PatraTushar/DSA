package ArraysbyKK.binarySearchPattern;

public class Q26 {

    static int findMax(int[] arr){

        int max=Integer.MIN_VALUE;

        for(int i:arr){
            if (i>max){
                max=i;
            }
        }

        return max;
    }



    static int minBananaEaten(int[] arr,int mid){

        int  totalHrs=0;

        for(int i=0;i<arr.length;i++){

            totalHrs+=Math.ceil((double) arr[i]/mid);
        }

        return totalHrs;




    }

    static int kokoEatingBananas(int[] arr,int hrs){



        int start=1;
        int end=findMax(arr);

        while (start<=end){
            int mid=start+(end-start)/2;

            int totalHrs=minBananaEaten(arr,mid);

            if(totalHrs<=hrs){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return start;
    }


    public static void main(String[] args) {

        // koko eating bananas leeTCode-->875

        int[] arr={3,6,7,11};
        int hrs=8;
        System.out.println(kokoEatingBananas(arr,hrs));


    }
}
