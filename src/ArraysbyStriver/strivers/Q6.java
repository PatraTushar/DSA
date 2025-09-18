package ArraysbyStriver.strivers;

public class Q6 {

    static int maxConsecutiveOnes(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int max1s = Integer.MIN_VALUE;
        int count1s = 0;

        for (int ele : arr) {

            if (ele == 1) {

                count1s++;
            } else {

                max1s = Math.max(max1s, count1s);
                count1s = 0;
            }
        }


        max1s=Math.max(max1s,count1s);

        return max1s;


    }

    public static void main(String[] args) {

        // maximum consecutive ones


        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(arr));

    }
}
