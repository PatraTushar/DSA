package ArraysbyStriver.strivers;

import java.util.Arrays;

public class Q13 {


    static int[] rearrangeElementsBySign(int[] nums){

        //// condition -> Equal number of positives and negatives bt the relative order are  same

        // Time Complexity: O(n)
        //  Space Complexity: O(n)


        int[] result=new int[nums.length];
        int positiveIndex=0;
        int negativeIndex=1;


        for(int i=0;i<nums.length;i++){

            if(nums[i]>0){

                result[positiveIndex]=nums[i];
                positiveIndex+=2;

            }
            else{

                result[negativeIndex]=nums[i];
                negativeIndex+=2;


            }
        }

        return result;



    }

    static int[] rearrangeElementsBySignI(int[] arr){

        // condition -> Equal number of positives and negatives bt the relative order are not same

         // Time Complexity: O(n)
        //  Space Complexity: O(1)


        int i=0;
        int j=1;
        int n=arr.length;

        while (i<n && j<n){

            if(arr[i]<0 && arr[j]>0){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i+=2;
                j+=2;
            }

            else {

                if(arr[i]>0) i+=2;
                if(arr[j]<0) j+=2;

            }
        }

        return arr;



    }


    public static void main(String[] args) {

        // Rearrange array elements by sign and there is equal number of positives and negatives

        int[] arr={3,1,-2,-5,2,-4};
        int[] Ans=rearrangeElementsBySign(arr);
        System.out.println(Arrays.toString(Ans));
        int[] Ans1=rearrangeElementsBySignI(arr);
        System.out.println(Arrays.toString(Ans1));
    }
}
