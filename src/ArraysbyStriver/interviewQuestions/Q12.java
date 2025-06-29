package ArraysbyStriver.interviewQuestions;
import  java.util.Scanner;

public class Q12 {

    static int[] qQueries(int[] arr){

        int[] freq=new int[100000];

        for(int i=0;i<arr.length;i++){

            freq[arr[i]]++;
        }

        return freq;


    }


    public static void main(String[] args) {

        // Q: Given q queries check if the number is present in teh array or not .NOTE:- value of all the element in the array is less than 10^5.

        //Time Complexity (TC): O(n + q)
        //Space Complexity (SC): O(100000)
        
        int[] arr={5,6,5,400,560,1000,400};
        Scanner sc=new Scanner(System.in);
        int[] Ans=qQueries(arr);

        System.out.println(" Enter Number Queries ");
        int Queries=sc.nextInt();

        for (int i=1;i<=Queries;i++){
            System.out.println(" enter " + i + " query ");
            int q=sc.nextInt();
            if(Ans[q]>0){
                System.out.println(" value is present ");
            }

            else {
                System.out.println(" value is not present ");
            }
        }



    }
}
