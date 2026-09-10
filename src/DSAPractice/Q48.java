package DSAPractice;

public class Q48 {

    static int majorityElement(int[] nums) {

        int n = nums.length;
        int currElement = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (count == 0) {

                currElement = nums[i];
                count++;
            } else if (currElement == nums[i]) count++;

            else count--;
        }

        return currElement;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }
}
