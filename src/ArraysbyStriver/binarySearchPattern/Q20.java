package ArraysbyStriver.binarySearchPattern;

public class Q20 {

    static boolean Search(int[][] arr,int target){

        int rows=arr.length;
        int columns=arr[0].length;
        int start=0;
        int end=rows*columns-1;

        while (start<=end){

            int mid=start+(end-start)/2;
            int midElement=arr[mid/columns][mid%columns];

            if(target==midElement) return true;

            else if(target<midElement){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] arr={{1,3,5,7,},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(Search(arr,target));
    }
}
