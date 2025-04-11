package ArraysbyKK.binarySearchPattern;

public class Q11 {

    static boolean search(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target) return true;

            else if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                start++;
                end--;

            }

            else if(nums[start]<=nums[mid]){

                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }

                else{
                    start=mid+1;
                }

            }

            else{

                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }

                else{
                    end=mid-1;
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
