package RecursionByStriver.BackTracking;

import java.util.*;

public class Q5 {


    // optimal solution
    static String getPermutation(int n,int k){

        // Time Complexity: O(n²)
       // Space Complexity: O(n)

        List<Integer> Number=new ArrayList<>();

        for(int i=1;i<=n;i++){

            Number.add(i);
        }

        int[] factorial=new int[n];
        factorial[0]=1;

        for(int i=1;i<n;i++){

            factorial[i]=factorial[i-1]*i;
        }


        k--;

        StringBuilder sb=new StringBuilder();

        for(int i=n;i>=1;i--){

            int fact = factorial[i - 1];
            int index = k / fact;
            sb.append(Number.get(index));
            Number.remove(index);
            k = k % fact;


        }


        return sb.toString();




    }






    public static void main(String[] args) {

        int n=3;
        int k=3;

        String ans=getPermutation(n,k);
        System.out.println(ans);


    }
}
