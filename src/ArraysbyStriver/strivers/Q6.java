package ArraysbyStriver.strivers;

public class Q6 {

    static int maxConsecutiveOnes(int[] num) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int maxConsecutiveOnes = 0;
        int count = 0;

        for (int ele : num) {

            if (ele == 1) count++;

            else {

                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);

                count = 0;
            }


        }

        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);

        return maxConsecutiveOnes;

    }

    public static void main(String[] args) {

        // leeTCode->485


        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(arr));

    }
}
