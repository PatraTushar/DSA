package searchingKK;

public class B7 {

    static int orderAgnosticBS(int arr[],int target,int start,int end){



        // check whether the array is ascending or descending

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){

                if(target>arr[mid]){
                    start=mid+1;
                }

                else{
                    end=mid-1;
                }


            }

            else {

                if(target>arr[mid]){
                    end=mid-1;
                }

                else {
                    start=mid+1;
                }
            }



        }

        return -1;
    }


    static int findPeakElement(int arr[]){

        int start=0;
        int end=arr.length-1;

        while (start != end) {

            int mid=start+(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }

            else{
                end=mid;
            }
        }

        return start;
    }

    static int search(int arr[],int target){

        int peak=findPeakElement(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);

        if(firstTry!=-1){
            return firstTry;

        }

        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,3,1};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);


    }
}
