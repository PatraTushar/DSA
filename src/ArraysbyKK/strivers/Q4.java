package ArraysbyKK.strivers;

public class Q4 {

    static int removeDuplicates(int[] nums){

        int i=0;

        for(int j=1;j<nums.length;j++){

            if(nums[j]!=nums[i]){
                nums[++i]=nums[j];

            }

        }

        return i+1;


    }

    public static void main(String[] args) {

        // Remove duplicates in place from sorted array (leeTCode-->26)

        int[] arr={1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
