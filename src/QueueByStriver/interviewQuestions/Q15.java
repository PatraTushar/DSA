package QueueByStriver.interviewQuestions;

public class Q15 {

    // Brute Force Approach
    static int minKBitFlips(int[] arr, int k) {

        // Time Complexity: O(n * k)
        //Space Complexity:  O(1)

        int n = arr.length;
        int flips = 0;

        for (int i = 0; i <= n - k; i++) {

            if (arr[i] == 0) {

                flips++;

                for (int j = 0; j < k; j++) {

                    arr[i + j] = 1 - arr[i + j];


                }

            }

        }

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) return -1;
        }

        return flips;
    }


    static int minKBitFlipsI(int[] nums, int k) {

        // Time Complexity: O(n)
        //Space Complexity:  O(n)


        int n = nums.length;
        int totalFlips = 0;
        int flipCount = 0;
        boolean[] isFlipped = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (i >= k && isFlipped[i - k]) {

                flipCount--;

            }


            if (flipCount % 2 == nums[i]) {

                if (i + k > n) return -1;

                isFlipped[i] = true;
                flipCount++;
                totalFlips++;


            }


        }


        return totalFlips;
    }

    static int minKBitFlipsII(int[] nums, int k) {

        // Time Complexity: O(n)
        //Space Complexity:  O(1)

        int n = nums.length;
        int totalFlips = 0;
        int flipCount = 0;


        for (int i = 0; i < n; i++) {

            if (i >= k && nums[i - k] == -1) {

                flipCount--;

            }


            if (flipCount % 2 == nums[i]) {

                if (i + k > n) return -1;

                nums[i] = -1;
                flipCount++;
                totalFlips++;


            }


        }


        return totalFlips;


    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 0, 1, 1, 0, 1, 0};
        int[] arr1 = {0, 0, 1, 0, 0, 1, 1, 0, 1, 0};
        int[] arr2 = {0, 0, 1, 0, 0, 1, 1, 0, 1, 0};
        int k = 4;
        int k1 = 4;
        int k2 = 4;
        System.out.println(minKBitFlips(arr, k));
        System.out.println(minKBitFlipsI(arr1, k1));
        System.out.println(minKBitFlipsII(arr2, k2));


    }
}
