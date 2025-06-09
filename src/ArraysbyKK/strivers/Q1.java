package ArraysbyKK.strivers;

import java.util.Arrays;

public class Q1 {

    // maintain relative order also
    static int[] moveZeroes(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int pos=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos++]=arr[i];
            }
        }

        while (pos<arr.length){
            arr[pos++]=0;
        }

        return arr;


    }



    public static void main(String[] args) {

        // move all zeroes to the end of the array (leeTCode-->283)

        int[] arr={1,0,2,3,2,0,0,4,5,1};
        int[] Ans=moveZeroes(arr);
        System.out.println(Arrays.toString(Ans));
    }
}
