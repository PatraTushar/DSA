package searchingKK;

public class searchInRotatedSortedArray {

    static int search(int arr[],int target) {

        if (arr.length == 0) {
            return -1;
        }

        // for unique elements

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            // check which part is sorted left or right

            if (arr[start] <= arr[mid]) {

                //left half is sorted

                if (target>=arr[start] && target<=arr[mid]){
                    return binarySearch(arr,target,start,mid);
                }

                else{
                    start=mid+1;
                }


            } else {

                // right half is sorted

                if(target>=arr[mid] && target<=arr[end]){
                    return binarySearch(arr,target,mid,end);
                }

                else{
                    end=mid-1;
                }


            }


        }

        return -1; // target not found
    }

    static int search1(int arr[],int target){

        // for duplicate elements

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target) return mid;

            if(arr[start]==arr[mid] && arr[mid]==arr[end]){

                start++;
                end--;
                continue;
            }

            if(arr[start]<=arr[mid]){

                // left side is sorted

                if(target>=arr[start] && target<=arr[mid]){

                    end=mid-1;
                }

                else{
                    start=mid+1;
                }


            }

            else{

                // right side is sorted

                if(target>=arr[mid] && target<=arr[end]){

                    start=mid+1;
                }

                else {
                    end=mid-1;
                }

            }


        }

        return -1;
    }





    static int binarySearch(int arr[],int target,int start,int end){


        while(start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[]={7,8,9,1,2,3,4,5,6};
        int target=1;
        int ans=search(arr,target);
        System.out.println(ans);

        int num[]={3,1,2,3,3,3,3};
        int target1=1;
        System.out.println(search1(num,target1));
    }
}
