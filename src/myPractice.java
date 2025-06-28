//
//
//public class myPractice {
//
//
//    static int sumOfMin(int[] arr){
//
//        int sum=0;
//        int MOD = (int) 1e9 + 7;
//
//        for(int i=0;i<arr.length;i++){
//
//            int mini=arr[i];
//
//            for (int j=i;j<arr.length;j++){
//
//                mini=Math.max(mini,arr[j]);
//                sum=(sum+mini)% MOD;
//            }
//
//
//        }
//
//        return sum;
//
//
//
//
//
//
//    }
//
//
//
//    public static void main(String[] args) {
//
//        int[] arr={3,1,2,4};
//        System.out.println(trappingRainWater(arr));
//
//
//
//
//
//    }
//
//
//}