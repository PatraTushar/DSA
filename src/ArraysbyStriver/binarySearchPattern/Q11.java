package ArraysbyStriver.binarySearchPattern;

public class Q11 {

    static boolean search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(nums[mid]==target) return true;

            else if(nums[low]==nums[mid] && nums[high]==nums[mid]){
                low++;
                high--;

            }

            else if(nums[low]<=nums[mid]){

                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }

                else{
                    low=mid+1;
                }

            }

            else{

                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }

                else{
                    high=mid-1;
                }
            }
        }

        return false;

    }



    public static void main(String[] args) {

        // search in rotated sorted array II (leeTCode-->81)

        int[] num={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(num,target));




    }
}
