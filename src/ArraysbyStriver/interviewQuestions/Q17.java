package ArraysbyStriver.interviewQuestions;

import java.util.Scanner;

public class Q17 {

    static int rangePrinting(int[] arr,int L,int R){

        int sum=0;

        for(int i=L;i<=R;i++){
            sum+=arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        // print the sum of values in a given range of indices from L to R.
        //Time Complexity (TC): O(R - L + 1) per query (in the worst case, where the range is the whole array)
        //Space Complexity (SC): O(1)

        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,1,3,6};

        System.out.println(" Enter number of Queries ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(" enter " + i + " query ");

            System.out.println(" enter L ");
            int L=sc.nextInt();

            System.out.println(" enter R");
            int R=sc.nextInt();

            System.out.println(" sum is " +rangePrinting(arr,L,R));

        }
    }
}
