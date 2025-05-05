import java.lang.reflect.Array;
import java.util.Arrays;

public class myPractice {

    static int findFirst(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int index=-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                index=mid;
                end=mid-1;
            }

            else if(target>arr[mid]) start=mid+1;
            else end=mid-1;
        }

        return index;
    }

    static int findLast(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int index=-1;

        while (start<=end){

            int mid=start+(end-start)/2;
            if(target==arr[mid]){

                index=mid;
                start=mid+1;

            }
           else if(target>arr[mid]) start=mid+1;
            else end=mid-1;
        }

        return index;
    }

    static int[] searchRange(int[] nums,int target){

        int[] result=new int[2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);

        return result;



    }




    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));


    }


}






