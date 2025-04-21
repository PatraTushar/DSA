package ArraysbyKK.strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q21 {


    static List<List<Integer>> fourSum(int[] nums,int target){

     //   Time Complexity (TC): O(n^3)

      //  Space Complexity (SC): O(n)

        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i]==nums[i-1] ) continue;

            for(int j=i+1;j<nums.length;j++){

                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=nums.length-1;

                while (k<l){

                    long sum=(long) nums[i]+nums[j]+nums[k]+nums[l];

                    if(sum==target){

                        List<Integer> temp=List.of(nums[i],nums[j],nums[k],nums[l]);
                        result.add(temp);
                        k++;
                        l--;

                        while (k<l && nums[k]==nums[k-1]) k++;
                        while (k<l && nums[l]==nums[l+1]) l--;

                    }

                    else if(sum<target){
                        k++;

                    }

                    else {
                        l--;
                    }
                }
            }

        }

        return result;


    }

    public static void main(String[] args) {

        // 4 sum (leeTCode->15)

        int[] arr={1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        int target=8;
        List<List<Integer>> ans=fourSum(arr,target);
        System.out.println(ans);

    }
}
