package QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;


public class Q36 {

    static int[] smallestAndLargest(int arr[]) {

        Arrays.sort(arr);
        int ans[] = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    static boolean isSorted(int arr[]) {

        boolean check = true;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }

        return check;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of the array");
        int n = sc.nextInt();


        int arr[] = new int[n];
        System.out.println(" enter " + n + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        int[] ans=smallestAndLargest(arr);
//        System.out.println(" smallest " +ans[0]);
//        System.out.println(" largest 7" +ans[1]);
//6




        System.out.println(" is sorted " + isSorted(arr));


    }
}
