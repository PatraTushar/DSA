package ArraysbyStriver.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Q4 {

    static int totalTripletPairs(int[] arr, int target) { // bruteforce

        //Time Complexity (TC): O(n³)
        //Space Complexity (SC): O(1)
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                int find = target - (arr[i] + arr[j]);

                for (int k = j + 1; k < n; k++) {
                    if (find == arr[k]) {
                        System.out.println(" pairs are : " + arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }

        return count;
    }


    static int totalTripletPairsI(int[] arr, int target) {  // optimal

        //   Time Complexity (TC): O(n²)
        //   Space Complexity (SC): O(1)


        Arrays.sort(arr);


        int count = 0;
        int n = arr.length;

        for (int p1 = 0; p1 < arr.length - 2; p1++) {

            int p2 = p1 + 1;
            int p3 = n - 1;

            while (p2 < p3) {

                int sum = arr[p1] + arr[p2] + arr[p3];


                if (sum == target) {

                    count++;
                    System.out.println(arr[p1] + " " + arr[p2] + " " + arr[p3]);

                    p2++;
                    p3--;
                } else if (sum < target) {

                    p2++;
                } else {

                    p3--;
                }
            }


        }

        return count;


    }

    public static void main(String[] args) {


        // Q: count the number of triplets whose sum is equal to  the given value

        int[] arr = {1, 4, 5, 6, 3};
        int target = 12;
        System.out.println(" total pairs " + totalTripletPairsI(arr, target));


    }
}
