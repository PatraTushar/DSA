import java.util.HashMap;

public class myPractice {

    static int smallerThanEqualTo(int[] arr, int goal) {

        int length = arr.length;
        int count = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < length; right++) {

            sum += arr[right];

            while (sum > goal) {

                sum -= arr[left];
                left++;

            }

            count += right - left + 1;
        }

        return count;
    }


    static int func(int[] arr, int goal) {

        return smallerThanEqualTo(arr,goal)-smallerThanEqualTo(arr,goal-1);


    }

    public static void main(String[] args) {


        int[] arr = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(func(arr, goal));
    }


}





