package BitManipulation.InterviewQuestions;

import java.util.Arrays;

public class Q11 {

    static int[] findArray(int[] pref){

        //  Time Complexity: O(n)
        //  Space Complexity: O(n)

        int n=pref.length;
        int[] res=new int[n];

        res[0]=pref[0];

        for(int i=1;i<n;i++){

            res[i]=pref[i-1]^pref[i];
        }

        return res;
    }

    public static void main(String[] args) {

        // leeTCode->2433

        int[] pref={5,2,0,3,1};
        int[] ans=findArray(pref);
        System.out.println(Arrays.toString(ans));

    }
}
