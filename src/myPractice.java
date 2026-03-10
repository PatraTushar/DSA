

public class myPractice {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {

            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int findClosestGreater(int[] num, int index) {

        int n = num.length;
        if (index <= 0 && index >= n) return -1;
        int target = num[index - 1];
        int closest = Integer.MAX_VALUE;
        int closestIndex = -1;

        for (int j = index; j < n; j++) {

            if (num[j] > target && num[j] <= closest) {

                closest = num[j];
                closestIndex = j;


            }


        }

        return closestIndex;

    }

    static void nextPermutation(int[] nums) {

        int n = nums.length;
        int breakPoint = -1;

        for (int i = n - 1; i > 0; i--) {

            if (nums[i] > nums[i - 1]) {

                breakPoint = i - 1;
                break;
            }
        }


        if (breakPoint != -1) {

            int swappingIndex = findClosestGreater(nums, breakPoint + 1);

            swap(nums,breakPoint,swappingIndex);
            reverse(nums,breakPoint+1,n-1);

        }

        else reverse(nums,0,n-1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};


    }


}