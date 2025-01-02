package searchingKK;

public class Q2 {

    static boolean searchInRange(int arr[],int target,int start,int end){

        if(arr.length==0){
            return false;
        }

        for(int i=0;i< arr.length;i++){

            if(arr[i]==target){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int nums[]={18,12,-7,3,14,28};
        int target=3;

        System.out.println(searchInRange(nums,target,1,4));


    }
}
