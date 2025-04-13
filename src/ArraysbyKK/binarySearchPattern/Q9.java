package ArraysbyKK.binarySearchPattern;

interface MountainArray {
    int get(int index);
    int length();
}

class MountainArrayImpl implements MountainArray {
    private int[] arr;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

public class Q9 {

    public static int binarySearch(MountainArray arr, int start, int end, int target, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        // Step 1: Find the peak index
        while (start != end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int peak = start;

        // Step 2: Try to find in the ascending part
        int index = binarySearch(mountainArr, 0, peak, target, true);
        if (index != -1) return index;

        // Step 3: Try to find in the descending part
        return binarySearch(mountainArr, peak + 1, mountainArr.length() - 1, target, false);
    }

    public static void main(String[] args) {

        // find in mountain array (leeTCode-->1095)

        int[] mountainArray = {1, 3, 5, 7, 6, 4, 2};
        int target = 4;

        MountainArray arr = new MountainArrayImpl(mountainArray);
        int result = findInMountainArray(target, arr);

        System.out.println("Index of target " + target + " is: " + result);
    }
}
