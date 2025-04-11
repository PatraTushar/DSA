package ArraysbyKK.interviewQuestions;

public class Q1 {

    static int trappingRainWater(int[] height){

        int n=height.length;
        int[] maxLeft=new int[n];
        int[] maxRight=new int[n];
        maxLeft[0]=0;

        for(int i=1;i<n;i++){
            maxLeft[i]=Math.max(maxLeft[i-1],height[i-1]);
        }

        maxRight[n-1]=0;
        for(int i=n-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],height[i+1]);
        }


        int water=0;

        for(int i=0;i<n;i++){
            int minHeight=Math.min(maxLeft[i],maxRight[i]);
            if(minHeight-height[i]>=0){
                water+=minHeight-height[i];
            }
        }

        return water;
    }

    public static void main(String[] args) {

        // Q: Trapping Rain Water

        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));

    }
}
