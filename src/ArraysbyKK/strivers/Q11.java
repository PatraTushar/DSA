package ArraysbyKK.strivers;

public class Q11 {

    static int majorityElement(int[] nums){

        int count=0;
        int element=0;

        for(int i=0;i<nums.length;i++){

            if(count==0){

                count++;
                element=nums[i];
            }

            else if(nums[i]==element){
                count++;
            }

            else{
                count--;
            }
        }

        return element;
    }

    public static void main(String[] args) {

        // majority element (leeTCode-->169)

        int[] arr={2,2,3,3,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
