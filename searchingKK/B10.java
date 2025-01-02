package searchingKK;

public class B10 {

    static int findPivot(int arr[]){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start +(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                return mid;
            }

            else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }

            else if(arr[start]>arr[mid]){
                end=mid-1;
            }

            else if(arr[start]<arr[mid]){
                start=mid+1;
            }
        }


        return -1;
    }

    static int search(int arr[],int target){

        int pivot=findPivot(arr);

        if(pivot==-1){                //array is not rotated

            return binarySearch(arr,target,0,arr.length-1);

        }


        if(target==pivot){
            return pivot;
        }

        else if(target>arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }


        return binarySearch(arr,target,pivot+1,arr.length-1);
    }

    static int binarySearch(int arr[],int target,int start,int end){

        while(start<=end){

            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }

            else if(target<arr[mid]){
                end=mid-1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[]={4,5,1,2,3};
        int target=2;
        System.out.println(search(arr,target));


    }


}
