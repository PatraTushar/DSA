package ArraysbyStriver.strivers;

public class Q39 {

    static int maxArea(int[] arr) {

        // Time Complexity (TC): O(n²)
        // Space Complexity (SC): O(1)

        int n = arr.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int height;
            int width;
            int area;

            for (int j = i + 1; j < n; j++) {

                height = Math.min(arr[i], arr[j]);
                width = j - i;
                area = height * width;
                maxArea = Math.max(area, maxArea);


            }
        }

        return maxArea;


    }

    static int maxAreaI(int[] height) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(1)


        int n = height.length;
        int left = 0;
        int right = n - 1;
        int width;
        int minHeight;
        int area;
        int maxArea = 0;

        while (left < right) {

            if (height[left] <= height[right]) {

                width = right - left;
                minHeight = Math.min(height[left], height[right]);
                area = width * minHeight;
                maxArea = Math.max(area, maxArea);
                left++;

            } else {

                width = right - left;
                minHeight = Math.min(height[left], height[right]);
                area = width * minHeight;
                maxArea = Math.max(area, maxArea);
                right--;


            }

        }

        return maxArea;
    }


    public static void main(String[] args) {

        // leeTCode->11

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
        System.out.println(maxAreaI(arr));

    }
}
