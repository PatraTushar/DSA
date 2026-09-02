package DSAPractice;

public class Q19 {

    static int trappingRainWater(int[] height) {

        int n = height.length;

        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalUnits = 0;

        while (left < right) {

            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax < rightMax) {

                totalUnits += leftMax - height[left];
                left++;
            } else {

                totalUnits += rightMax - height[right];
                right--;
            }
        }

        return totalUnits;


        }




        public static void main (String[]args){

            int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
            System.out.println(trappingRainWater(height));


        }
    }
