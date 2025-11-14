//package Greedy;
//
//import java.util.HashMap;
//
//public class Q28 {
//
//    static int furthestBuilding(int[] heights, int bricks, int ladders) {
//
//        int n = heights.length;
//
//        int totalBricks = bricks;
//        int totalLadders = ladders;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < n - 1; i++) {
//
//            if (heights[i] < heights[i + 1]) {
//
//                int bricksRequired = heights[i + 1] - heights[i];
//
//                if (totalBricks >= bricksRequired) {
//
//                    totalBricks -= bricksRequired;
//                    map.put(i, totalBricks);
//                } else {
//
//                    int recentBricksRequired = heights[i + 1] - heights[i];
//                    int pastBricksStored= map.isEmpty() ? 0 :
//
//
//                }
//            }
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//
//
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//
//        int[] heights = {4, 2, 7, 6, 9, 14, 12};
//        int bricks = 5;
//        int ladders = 1;
//        System.out.println(furthestBuilding(heights, bricks, ladders));
//
//
//    }
//}
