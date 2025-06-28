package StackByStriver.interviewQuestions;

public class Q6 {

    static int[] prefixMax(int[] arr){

        int[] pMax=new int[arr.length];

        pMax[0]=arr[0];

        for(int i=1;i<arr.length;i++){

            pMax[i]=Math.max(pMax[i-1],arr[i]);
        }

        return pMax;


    }

    static int[] suffixMax(int[] arr){

        int n=arr.length;
        int[] sMax=new int[n];

        sMax[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){

            sMax[i]=Math.max(sMax[i+1],arr[i]);
        }

        return sMax;


    }


    static int trappingRainWater(int[] height){

        int totalUnits=0;

        int[] leftMax=prefixMax(height);
        int[] rightMax=suffixMax(height);

        for (int i=0;i<height.length;i++){

            if(height[i]< leftMax[i] && height[i]<rightMax[i]){

                totalUnits+=Math.min(leftMax[i],rightMax[i]) - height[i];
            }
        }

        return totalUnits;


    }

    public static void main(String[] args) {

        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(arr));





    }



}
