package ArraysbyKK.strivers;

import java.util.Arrays;

public class Q13 {

    static int[] rearrangeElementsBySign(int[] num){  // bruteForce approach

       // Time Complexity: O(n)
      //  Space Complexity: O(n)

        int[] positives=new int[num.length/2];
        int[] negatives=new int[num.length/2];
        int[] finalArr=new int[num.length];
        int a=0;
        int b=0;

        for(int i=0;i<num.length;i++){

            if(num[i]>0){
                positives[a]=num[i];
                a++;

            }

            else{
                negatives[b]=num[i];
                b++;
            }

        }

        for(int i=0;i<num.length/2;i++){

            num[2*i]=positives[i];
            num[2*i+1]=negatives[i];

        }

        return num;
    }

    static int[] rearrange(int[] nums){

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


    public static void main(String[] args) {

        // Rearrange array elements by sign and there is equal number of positives and negatives

        int[] arr={3,1,-2,-5,2,-4};
        int[] Ans=rearrangeElementsBySign(arr);
        System.out.println(Arrays.toString(Ans));
        int[] Ans1=rearrange(arr);
        System.out.println(Arrays.toString(Ans1));
    }
}
