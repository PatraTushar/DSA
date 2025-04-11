package ArraysbyKK.interviewQuestions;

import practice.Main;

public class Q6 {

    static int secondLargest(int[] arr){

      int largest=Integer.MIN_VALUE;
      int secLargest=Integer.MIN_VALUE;

      for(int a:arr){

          if(a>largest){
              secLargest=largest;
              largest=a;
          }
          else if(a>secLargest && a!=largest) {

              secLargest=a;

          }

      }
      return secLargest;
    }

    public static void main(String[] args) {

        // Q: Program to find the second largest element in the given array

        int[] arr={9,8,9,6,9,5,8};
        System.out.println(" second largest is :"+ secondLargest(arr));


    }
}
