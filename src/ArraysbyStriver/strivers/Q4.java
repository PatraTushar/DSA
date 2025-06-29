package ArraysbyStriver.strivers;

public class Q4 {

    static int removeDuplicates(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        if(arr.length==0) return 0;

        int pos=1;
        int prevAns=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]!=prevAns){
                arr[pos++]=arr[i];
                prevAns=arr[i];
            }


        }
        return pos;
    }





    public static void main(String[] args) {

        // Remove duplicates in place from sorted array (leeTCode-->26)

        int[] arr={1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
