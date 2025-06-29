package ArraysbyStriver.strivers;

import java.util.HashMap;

public class Q8 {

    static int longestSubArrSumK(int[] arr,int k){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLength=0;

        for(int i=0;i<arr.length;i++){

            sum+=arr[i];

            if(sum==k){
                maxLength=i+1;
            }

            if(map.containsKey(sum-k)){

                int length=i-map.get(sum-k);
                maxLength=Math.max(maxLength,length);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }




        return maxLength;
    }

    public static void main(String[] args) {

        // Longest subArray with sum k (Positives)

        int[] arr={1,2,3,1,1,1,1,4,2,3};
        System.out.println(longestSubArrSumK(arr,3));



    }
}
