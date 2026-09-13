package DSAPractice;

public class Q51 {

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

    static int findGreaterClosest(int[] arr, int index) {

        int n = arr.length;
        if (index <= 0 || index >= n) return -1;
        int target = arr[index - 1];
        int closest = Integer.MAX_VALUE;
        int closestIndex = -1;

        for (int i = index; i < n; i++) {

            if (arr[i] > target && arr[i] <= closest) {
                closest = arr[i];
                closestIndex = i;
            }

        }

        return closestIndex;


    }

    static void nextPermutation(int[] arr) {

        int n = arr.length;
        int breakingPoint = -1;

        for (int i = n - 1; i > 0; i--) {

            if (arr[i] > arr[i - 1]) {

                breakingPoint = i;
                break;
            }
        }

        if (breakingPoint != -1) {

            int swappingIndex = findGreaterClosest(arr, breakingPoint);

            swap(arr, breakingPoint - 1, swappingIndex);
            reverse(arr, breakingPoint, n - 1);


        } else {

            reverse(arr, 0, n - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2};
        nextPermutation(arr);
    }
}
