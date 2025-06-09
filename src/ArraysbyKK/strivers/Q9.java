package ArraysbyKK.strivers;

import java.util.HashMap;

public class Q9 {

    static int subArraySumEqualsK(int[] arr,int k){

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        HashMap<Integer,Integer> map=new HashMap<>();
        int totalSubArray=0;
        int sum=0;

        map.put(sum,1);

        for(int i=0;i<arr.length;i++){

            sum+=arr[i];

            if(map.containsKey(sum-k)){

                totalSubArray+=map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }

            else {
                map.put(sum,1);
            }


        }

        return totalSubArray;
    }

    public static void main(String[] args) {

      //   SubArray Sum Equals K  (leeTCode->560)

        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(subArraySumEqualsK(arr,k));
    }
}
