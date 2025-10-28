

public class myPractice {

    static int longestSubarraywithsumsmallerthanequalk(int[] arr, int k) {

        int n = arr.length;
        int longest = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > k) {

                sum -= arr[left];
                left++;

            }


            longest = Math.max(longest, right - left + 1);


        }

        return longest;

    }

    public static void main(String[] args) {


        int[] arr = {20, 1, 1, 1, 1, 1, 1, 5};
        int k = 10;
        System.out.println(longestSubarraywithsumsmallerthanequalk(arr, k));


    }


}

