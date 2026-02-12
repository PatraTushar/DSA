package ARRAYS.binarySearchPattern;

public class Q20 {

    static boolean Search(int[][] arr,int target){

        // Time Complexity: O(rows + col)
        // Space Complexity: O(1)


        int rows = 0;
        int cols = arr[0].length - 1;

        while (rows < arr.length && cols >= 0) {

            if (arr[rows][cols] == target) return true;

            else if (arr[rows][cols] > target) {

                cols--;
            } else rows++;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] arr={{1,3,5,7,},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(Search(arr,target));
    }
}
