package StackByStriver.interviewQuestions;

public class Q18 {

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


    static int nextGreaterElementIII(int n) {

        // Time Complexity (TC): O(length)
        //Space Complexity (SC): O(length)

        String s = Integer.toString(n);

        int length = s.length();

        int[] digit = new int[length];


        for (int i = 0; i < length; i++) {

            digit[i] = s.charAt(i) - '0';
        }

        int pivotIndex = -1;

        for (int i = length - 1; i > 0; i--) {

            if (digit[i] > digit[i - 1]) {

                pivotIndex = i - 1;
                break;

            }

        }


        if (pivotIndex != -1) {

            int swappingIndex = findGreaterClosest(digit, pivotIndex + 1);

            swap(digit, pivotIndex, swappingIndex);

            reverse(digit, pivotIndex + 1, length - 1);

            StringBuilder sb = new StringBuilder();

            for (int ele : digit) sb.append(ele);

            long val = Long.parseLong(sb.toString());

            return (val <= Integer.MAX_VALUE) ? (int) val : -1;


        } else return -1;


    }

    public static void main(String[] args) {

        // leeTCode->556

        System.out.println(nextGreaterElementIII(12));


    }
}
