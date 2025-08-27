package BitManipulation.InterviewQuestions;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.function.Supplier;

public class Q10 {


    static int countBits(int num) {

        int x = num;
        int count = 0;

        while (x != 0) {

            int bit = x & 1;


            if ((bit & 1) == 1) {

                count++;
            }

            x = x >> 1;


        }

        return count;
    }

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] sortByBits(int[] arr) {

        // Time Complexity: O(n⋅log m)+O(n2)=O(n2)        m=num
        // Space Complexity: O(n)

        int n = arr.length;

        int[] res = new int[n];


        for (int i = 0; i < n; i++) {

            res[i] = countBits(arr[i]);
        }

        int length=res.length;

        int left = 0;
        int right = length - 1;

        while (left <= right) {


            if (res[left] < res[right] || ((res[left] == res[right] && arr[left] <= arr[right]))) {
                left++;
            }

            else {

                swap(arr,left,right);
                swap(res,left,right);

                left=0;
                right=length-1;

            }


        }

        return arr;


    }


    static int[] sortByBitsI(int[] arr){

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)

        return Arrays.stream(arr).boxed().sorted((a,b)->{

            int countA=Integer.bitCount(a);
            int countB=Integer.bitCount(b);

            if(countA !=countB) return countA-countB;

            return a-b;

        }).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        // leeTCode->1356

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = sortByBits(arr);
        System.out.println(Arrays.toString(ans));

        int[] arr2={1024,512,256,128,64,32,16,8,4,2,1};
        int[] ans2=sortByBitsI(arr2);
        System.out.println(Arrays.toString(ans2));

    }
}
