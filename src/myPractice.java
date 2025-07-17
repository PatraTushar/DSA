import java.util.ArrayList;
import java.util.List;

public class myPractice {

    static int findTarget(int[] arr, int start, int end, int target) {

        int mid = start + (end - start) / 2;

        if (start > end) return -1;


        if (arr[mid] == target) return mid;

        if(arr[start]<=arr[mid]){

            if(target>=arr[start] && target<arr[mid]){

                return findTarget(arr,start,mid-1,target);

            }

            else {

                return findTarget(arr,mid+1,end,target);
            }
        }

        else {

            if(target>arr[mid] && target<=arr[end]){

                return findTarget(arr,mid+1,end,target);
            }

            else {

                return findTarget(arr,start,mid-1,target);
            }
        }




    }

    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 1;
        System.out.println(findTarget(arr, 0, arr.length - 1, 6));


    }


}

