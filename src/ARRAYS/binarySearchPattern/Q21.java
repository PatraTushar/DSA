package ARRAYS.binarySearchPattern;

public class Q21 {

    static boolean searchMatrix(int[][] matrix, int target) {

        // Time Complexity: O(rows + col)
        // Space Complexity: O(1)

        int rows=0;
        int columns=matrix[rows].length-1;

        while (rows<matrix.length && columns>=0){

            if(matrix[rows][columns]==target){
                return true;
            }

            else if(target<matrix[rows][columns]){
                columns--;
            }

            else {
                rows++;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        // search a 2D matrix II (leeTCode-->240)

        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        System.out.println(searchMatrix(arr,target));
    }
}
