
public class Q9 {

    interface MountainArray {
        int get(int index);

        int length();
    }

    static class MountainArrayImpl implements MountainArray {
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


    static int binarySearch(MountainArray arr, int target, int low, int high, boolean isAsc) {


        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int midVal = arr.get(mid);


            if (target == midVal) {

                index = mid;
                high = mid - 1;

            }

            if (isAsc) {

                if (target > midVal) low = mid + 1;
                else if (target < midVal) high = mid - 1;
            } else {

                if (target < midVal) low = mid + 1;
                else if (target > midVal) high = mid - 1;


            }


        }

        return index;
    }

    static int findPeakIndex(MountainArray arr) {

        int n = arr.length();

        int low = 0;
        int high = n - 1;


        while (low <= high) {

            int mid = low + (high - low) / 2;
            int midVal = arr.get(mid);


            if ((mid > 0 && midVal > arr.get(mid - 1)) && (mid < n - 1 && midVal > arr.get(mid + 1))) return mid;

            else if ((mid < n - 1) && (midVal > arr.get(mid + 1))) high = mid;

            else low = mid + 1;
        }

        return -1;


    }


    static int findInMountainArray(MountainArray mountainArr, int target) {


        int peakIndex = findPeakIndex(mountainArr);

        int firstPart = binarySearch(mountainArr, target, 0, peakIndex, true);
        int secondPart = binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1, false);

        if (firstPart != -1) return firstPart;
        else return secondPart;


    }


    public static void main(String[] args) {

        int[] mountainArray = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;


        MountainArray arr = new MountainArrayImpl(mountainArray);
        int result = findInMountainArray(arr, target);

        System.out.println("Index of target " + target + " is: " + result);

    }
}


