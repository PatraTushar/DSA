

public class myPractice {

    static int func(int[] arr, int target) {

        int n = arr.length;
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            sum += arr[right];


            while (sum > target) {

                sum -= arr[left];
                left++;

            }

            if (sum == target) {

                minLength = Math.min(minLength, right - left + 1);


            }


        }

        return minLength;


    }

    public static void main(String[] args) {


        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;
        System.out.println(func(arr, k));


    }


}

