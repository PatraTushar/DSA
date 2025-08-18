

public class myPractice {


    static int longestOnesI(int[] nums,int k){

        int n=nums.length;
        int maxLength=0;
        int zeroesFlip=0;
        int left=0;
        int right=0;

        for(int i=0;i<n;i++){

            if(nums[right]==0){

                zeroesFlip++;
            }

            while (zeroesFlip>k){

                if(nums[left]==0){
                    zeroesFlip--;
                }

                left++;
            }
            int length=right-left+1;
            maxLength=Math.max(maxLength,length);
            right++;






        }

        return maxLength;




    }



    public static void main(String[] args) {


        int[] arr={6,2,3,4,7,2,1,7,1};
        int k=4;


    }

}














