

public class myPractice {

    static int trappingRainWater(int[] heights) {


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

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingRainWater(height));

    }
}








