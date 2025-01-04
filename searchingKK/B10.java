package searchingKK;

public class B10 {

    static int findPivot(int arr[]){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(mid<end){
                return mid;
            }

            else if(mid>start && arr[mid]<arr[mid]-1){
                return mid-1;
            }

            else if (arr[start]>arr[mid]){
                end=mid-1;
            }

            else {
                start=mid+1;
            }
        }

        return -1;


    }

    static int countRotation(int arr[]){

        int pivot=findPivot(arr);

        return pivot+1;
    }

    public static void main(String[] args) {

        int arr[]={4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
        System.out.println("vdshh");


    }
}
