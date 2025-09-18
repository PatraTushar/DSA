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


    static int longest(int[] arr,int k){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        // only for positive input


        int n = arr.length;
        int sum = 0;
        int maxLength = 0;


        int left = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            if (sum == k) {

                maxLength = Math.max(maxLength, right - left + 1);


            }

            while (sum > k) {

                sum -= arr[left];
                left++;
            }


            maxLength = Math.max(maxLength, right - left + 1);


        }

        return maxLength;


    }

    public static void main(String[] args) {

        // Longest subArray with sum k (Positives)

        int[] arr={1,2,3,1,1,1,1,4,2,3};
        System.out.println(longestSubArrSumK(arr,3));
        System.out.println(longest(arr,3));



    }
}
