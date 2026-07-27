package SlidingWindow.InterviewQuestions;

public class Q27 {

    static int numberOfAlternatingGroups(int[] colors, int k) {

        // Time Complexity (TC): O(n+k)
        //Space Complexity (SC): O(n+k-1)->O(n+k)->O(n)


        int n = colors.length;
        int N = n + k - 1;

        int[] extended = new int[N];

        // Copy original array
        System.arraycopy(colors, 0, extended, 0, n);

        // Handle circular array
        for (int i = 0; i < k - 1; i++) {

            extended[n + i] = colors[i];

        }


        int left = 0;
        int result = 0;

        for (int right = 1; right < N; right++) {

            // windows become invalid
            if (extended[right] == extended[right - 1]) {
                left = right;
                continue;

            }


            // valid window of size k

            if (right - left + 1 == k) {

                result++;
                left++;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        // leeTCode->3208

        int[] colors = {0, 1, 0, 1, 0};
        int k = 3;
        System.out.println(numberOfAlternatingGroups(colors, k));
    }
}


// System.arraycopy(sourceArray, sourcePosition, destinationArray, destinationPosition, length);
//
//where:
//
//sourceArray → array to copy from
//sourcePosition → starting index in the source array
//destinationArray → array to copy into
//destinationPosition → starting index in the destination array
//length → number of elements to copy