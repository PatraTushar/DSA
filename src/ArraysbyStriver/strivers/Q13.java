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


        int positive=0;
        int negative=1;
        int n=arr.length;

        while (positive<n && negative<n){

            if(arr[positive]<0 && arr[negative]>0){

                int temp=arr[positive];
                arr[positive]=arr[negative];
                arr[negative]=temp;
                positive+=2;
                negative+=2;
            }

            else {

                if(arr[positive]>0) positive+=2;
                if(arr[negative]<0) negative+=2;

            }
        }

        return arr;



    }


    public static void main(String[] args) {

        // Rearrange array elements by sign and there is equal number of positives and negatives

        int[] arr={3, 1,2,-12,-5,-4};
        int[] Ans=rearrangeElementsBySign(arr);
        System.out.println(Arrays.toString(Ans));
        int[] Ans1=rearrangeElementsBySignI(arr);
        System.out.println(Arrays.toString(Ans1));
    }
}
