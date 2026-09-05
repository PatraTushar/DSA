package DSAPractice;

public class Q30 {


    static boolean search(int[] num, int target) {

        int n = num.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (num[mid] == target) return true;

            else if (num[low] == num[mid] && num[mid] == num[high]) {
                low++;
                high--;
            } else if (num[low] <= num[mid]) {

                if (target >= num[low] && target < num[mid]) high = mid - 1;
                else low = mid + 1;
            } else {

                if (target > num[mid] && target <= num[high]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int[] num = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        System.out.println(search(num, target));

    }
}
