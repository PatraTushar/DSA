package BitManipulation.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    static List<List<Integer>> printSubsets(int[] arr){

        //  Time Complexity: O(n*2^n)
        //  Space Complexity: O(n*2^n)

        int n=arr.length;

        int subsets=1<<n;
        List<List<Integer>> result=new ArrayList<>();


        for(int num=0;num<subsets;num++){

            List<Integer> ans=new ArrayList<>();


            for(int j=0;j<n;j++){

                if((num & (1<<j))!=0) ans.add(arr[j]);


            }

            result.add(ans);

        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->76

        int[] arr={1,2,3};
        List<List<Integer>> subsets=printSubsets(arr);
        System.out.println(subsets);




    }
}
