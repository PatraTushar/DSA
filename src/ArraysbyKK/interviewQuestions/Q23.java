package ArraysbyKK.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Q23 {

    //Time Complexity: O(n^2)
    //Space Complexity: O(n^2)

    static int[][] pascal(int n){

      int[][] ans=new int[n][];


        for(int i=0;i<n;i++){

            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;


            for(int j=1;j<i;j++){

                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];



            }
        }



        return ans;


    }

    static List<List<Integer>> pascalTriangle(int n){

        //Time Complexity: O(n^2)
        //Space Complexity: O(n^2)

        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<n;i++){

            List<Integer> row=new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){

                    row.add(1);

                }

                else {

                    int val=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                    row.add(val);

                }
            }

            result.add(row);
        }

        return result;


    }

    public static void main(String[] args) {

        // pascal triangle  leeTCode->118

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int n=sc.nextInt();
       int[][] result= pascal(n);
        System.out.println(Arrays.deepToString(result));
        List<List<Integer>> ans=pascalTriangle(5);
        System.out.println(ans);




    }
}
