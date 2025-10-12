import java.util.*;

public class myPractice {


    static int longestConsecutiveSubsequence(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        int longest = Integer.MIN_VALUE;


        for (int ele : arr) {

            set.add(ele);
        }


        for (int ele : arr) {


            if (!set.contains(ele - 1)) {

                int currNum = ele;
                int length = 1;

                while (set.contains(currNum + 1)) {


                    length++;
                    currNum++;
                }

                longest = Math.max(longest, length);
            }


        }

        return longest;

    }

    public static void main(String[] args) {

        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutiveSubsequence(arr));


    }
}







