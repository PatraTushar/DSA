package searchingKK;

public class B6 {

    static int peakIndexInMountainArray(int arr[]){

        int start=0;
        int end=arr.length-1;

        while(start!=end){

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

    public static void main(String[] args) {

        int arr[]={1,2,3,4,6,4,3,2};              //op=4;
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
}
