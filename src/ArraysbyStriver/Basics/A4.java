package ArraysbyStriver.Basics;

public class A4 {

    static boolean isSorted(int[] arr){
        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }



        return true;
    }

    public static void main(String[] args) {

        // Q: program to check if the array is sorted or not

        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr));

    }
}
