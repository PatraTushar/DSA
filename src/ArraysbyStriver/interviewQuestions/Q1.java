package ArraysbyStriver.interviewQuestions;

public class Q1 {

    static int trappingRainWater(int[] heights) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)


        int n = heights.length;
        int totalUnits = 0;

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0] = heights[0];

        for (int i = 1; i < n; i++) {

            prefixMax[i] = Math.max(prefixMax[i - 1], heights[i]);


        }


        suffixMax[n - 1] = heights[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            suffixMax[i] = Math.max(suffixMax[i + 1], heights[i]);

        }


        for (int i = 0; i < n; i++) {


            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];


            if (heights[i] < leftMax && heights[i] < rightMax) {

                totalUnits += Math.min(leftMax, rightMax) - heights[i];
            }

        }


        return totalUnits;


    }


    static int trappingRainWaterI(int[] heights) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        int n = heights.length;

        int leftMax = 0;
        int rightMax = 0;
        int totalUnits = 0;

        int left = 0;
        int right = n - 1;

        while (left < right) {


            if (heights[left] <= heights[right]) {

                if (leftMax > heights[left]) totalUnits += leftMax - heights[left];
                else leftMax = heights[left];

                left++;

            } else {

                if (rightMax > heights[right]) totalUnits += rightMax - heights[right];
                else rightMax = heights[right];

                right--;


            }

        }

        return totalUnits;


    }

    public static void main(String[] args) {

        // Q: Trapping Rain Water

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingRainWater(height));
        System.out.println(trappingRainWaterI(height));

    }
}
