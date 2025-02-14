package RECURSION;

import java.util.Scanner;

public class Q16 {

    static int searchingIndexOfElements(int arr[],int target,int index) {

        //BASE CASE

        if(index== arr.length){

            return -1;
        }

        //RECURSIVE WORK

        int ans = searchingIndexOfElements(arr, target, index + 1);

        //SELF WORK

        if (arr[index] == target) {
            return index;
        }

        return ans;
    }

    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println(" enter size of the array ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println(" enter " + n + " elements ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(" enter target ");
            int target = sc.nextInt();
            int ans= searchingIndexOfElements(arr, target, 0);
              System.out.println(" index is " +ans);

        }
}
