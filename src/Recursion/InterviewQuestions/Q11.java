package Recursion.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q11 {


    // ITERATIVE APPROACH
    static List<List<Integer>> subset(int[] arr) {

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


   // RECURSIVE APPROACH

    static List<List<Integer>> subsetI(int[] arr){

        // Time Complexity: O(2ⁿ × n)
        // Space Complexity: O(2ⁿ × n)

        return Helper(arr,0,new ArrayList<>(),new ArrayList<>());


    }

    static List<List<Integer>> Helper(int[] arr,int index,List<Integer> subset,List<List<Integer>> result){

        if(index==arr.length){
            result.add(new ArrayList<>(subset));
            return result;
        }

        subset.add(arr[index]);
      Helper(arr,index+1,subset,result);

        subset.remove(subset.size()-1);
        Helper(arr,index+1,subset,result);

        return result;

    }





    public static void main(String[] args) {

        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
        System.out.println(ans);

        List<List<Integer>> ans1=subsetI(arr);
        System.out.println(ans1);


    }
}
