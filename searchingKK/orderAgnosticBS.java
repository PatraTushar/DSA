package searchingKK;

public class orderAgnosticBS {

    static int orderAgnosticBS(int arr[],int target){

        int start=0;
        int end=arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){

            int mid=start + (end-start)/2;

           if(arr[mid]==target){
               return mid;
           }


           if(isAsc){

               if(target<arr[mid]){
                   end=mid-1;
               }

               else{
                   start=mid+1;
               }
           }

           else{

               if(target<arr[mid]){
                   start=mid+1;
               }

               else{

                   end=mid-1;
               }
           }
        }



       return -1;

    }

    public static void main(String[] args) {

        int ascending[]={1,3,5,6,9,12,14,20,33};
        int target1=20;
        int ans1=orderAgnosticBS(ascending,target1);
        System.out.println(ans1);


        int descending[]={100,90,80,70,60,50,40,30,20,10};
        int target2=70;
        int ans2=orderAgnosticBS(descending,target2);
        System.out.println(ans2);




    }
}
