package ArraysbyKK.interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;
public class Q23 {

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

    public static void main(String[] args) {

        // pascal triangle  leeTCode->118

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int n=sc.nextInt();
       int[][] result= pascal(n);
        System.out.println(Arrays.deepToString(result));




    }
}
