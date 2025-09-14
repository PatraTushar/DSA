package ArraysbyStriver.binarySearchPattern;

public class Q13 {

    static int rotationCount(int[] num){

        // Time Complexity: O(log n)
        // Space Complexity: O(1)



        int start = 0;
        int end = num.length - 1;

        while (start != end) {

            int mid = start + (end - start) / 2;


            if (num[start] >= num[end] && num[start] <= num[mid]) {

                start = mid + 1;

            } else end = mid;


        }

        return end;


    }

    public static void main(String[] args) {

        // find the rotation count in rotated sorted array

        int[] num={3,4,5,1,2};
        System.out.println(rotationCount(num));

    }
}
