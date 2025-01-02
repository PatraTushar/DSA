package searchingKK;

public class BinarySearch {

    // for ascending order

    static int BS(int arr[],int target){

        // if element exist return index else return -1

        int start=0;
        int end=arr.length-1;

        while(start<=end){

        int mid=start + (end-start)/2;



            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;

            }

            else{
                return mid;
            }
        }

        return -1;




    }


    // for descending order

    static int bsForDescendingOrder(int arr[],int target){

        int start=0,end=arr.length-1;

        while(start<=end){

            int mid=start + (end-start)/2;

            if(target<arr[mid]){
                start=mid+1;
            }

            else if(target>arr[mid]){
                end=mid-1;
            }

            else{
                return mid;
            }
        }

        return -1;


    }

    public static void main(String[] args) {

        int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=15;
        int ans=BS(arr,target);
        System.out.println(ans);

        int arr2[]={90,75,18,12,6,4,3,1};
        int target2=18;
        int ans2=bsForDescendingOrder(arr2,target2);
        System.out.println(ans2);



    }
}
