package ArraysbyKK;

import java.util.Arrays;

public class passingInFunctions {

    static void fun(int nums[]){

        nums[0]=100;


    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
}
