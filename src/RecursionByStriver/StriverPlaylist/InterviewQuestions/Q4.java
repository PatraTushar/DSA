package RecursionByStriver.StriverPlaylist.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {

    static List<String> AllSubsets(String str, String Ans, List<String> list) {

        //  Time Complexity: O(2^n)
        // Space Complexity: O(2^n * n)     You're storing 8 strings — and strings take memory per character

        // It is Parametrized Recursion

        if (str.isEmpty()) {

            list.add(Ans);
            return list;

        }

        char ch = str.charAt(0);

        AllSubsets(str.substring(1), Ans + ch, list);
        AllSubsets(str.substring(1), Ans, list);


        return list;


    }

    static List<String> AllSubsetsI(String str, String Ans) {

        //  Time Complexity: O(2^n * n)
        // Space Complexity: O(2^n * n)     You're storing 8 strings — and strings take memory per character

        // It is Functional Recursion

        List<String> list = new ArrayList<>();

        if (str.isEmpty()) {
            list.add(Ans);
            return list;

        }

        char ch = str.charAt(0);

        List<String> add = AllSubsetsI(str.substring(1), Ans + ch);
        List<String> DoNotAdd = AllSubsetsI(str.substring(1), Ans);

        list.addAll(add);
        list.addAll(DoNotAdd);
        return list;
    }


    static List<String> subsetsAscii(String str, String Ans, List<String> list) {


        //  Time Complexity: O(3^n)
        // Space Complexity: O(3^n * n)     You're storing 8 strings — and strings take memory per character

        // It is Parametrized Recursion

        if (str.isEmpty()) {

            list.add(Ans);
            return list;

        }

        char ch = str.charAt(0);

        subsetsAscii(str.substring(1), Ans + ch, list);
        subsetsAscii(str.substring(1), Ans, list);
        subsetsAscii(str.substring(1), Ans + (ch + 0), list);


        return list;


    }

    static List<List<Integer>> subsequence(int[] arr) {

        // Time Complexity: O(2ⁿ × n)
        // Space Complexity: O(2ⁿ × n)

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int ele : arr) {

            int n = outer.size();

            for (int i = 0; i < n; i++) {

                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(ele);
                outer.add(inner);
            }


        }

        return outer;


    }


    static List<List<Integer>> subsequenceWithNoDuplicates(int[] nums) {

        // Time Complexity: O(2ⁿ × n)
        // Space Complexity: O(2ⁿ × n)
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start ;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;

            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }


            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {


                List<Integer> inner = new ArrayList<>(outer.get(j));

                inner.add(nums[i]);
                outer.add(inner);
            }


        }

        return outer;


    }


    public static void main(String[] args) {

        String str = "abc";
        String str2 = "ab";
        List<String> subsets = AllSubsets(str, "", new ArrayList<>());
        System.out.println(subsets);
        List<String> subsetsI = AllSubsetsI(str, "");
        System.out.println(subsetsI);
        List<String> subsetsAscii = subsetsAscii(str2, "", new ArrayList<>());
        System.out.println(subsetsAscii);

        int[] arr = {1, 2, 3};
        List<List<Integer>> subsequence = subsequence(arr);
        System.out.println(subsequence);

        int[] arr2 = {1, 2, 2};
        List<List<Integer>> noDuplicateSubsequence = subsequenceWithNoDuplicates(arr2);
        System.out.println(noDuplicateSubsequence);

    }
}
