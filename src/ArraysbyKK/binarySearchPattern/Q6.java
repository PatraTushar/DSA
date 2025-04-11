package ArraysbyKK.binarySearchPattern;

import java.util.Arrays;

public class Q6 {

    static int[] searchRange(int[] arr,int target){

        int[] result={-1,-1};

        result[0]=search(arr,target,true);

        if(result[0]!=-1){
            result[1]=search(arr,target,false);
        }

        return result;
    }

    static int search(int[] arr,int target,boolean findFirstIndex){

        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]) {

                end=mid-1;

            }

            else {

                ans=mid;

                if(findFirstIndex){

                    end=mid-1;
                }

                else {
                    start=mid+1;
                }
            }
        }


        return ans;


    }

    public static void main(String[] args) {

        // find the first and last position of element in sorted array   (leeTCode->34)

        int[] arr={5,7,7,8,8,10};
        int target=8;

        int[] finalAns=searchRange(arr,target);
        System.out.println(Arrays.toString(finalAns));
    }
}
