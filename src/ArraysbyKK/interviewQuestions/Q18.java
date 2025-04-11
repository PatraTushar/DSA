package ArraysbyKK.interviewQuestions;

public class Q18 {

    static boolean subArrayWithEqualSum(int[] arr){

      int totalSum=0;

      for(int a: arr){
          totalSum+=a;
      }

      int prefixSum=0;

      for(int i=0;i<arr.length;i++){
          prefixSum+=arr[i];

          if(prefixSum*2==totalSum) return true;
      }

      return false;

    }

    public static void main(String[] args) {

        // Q: check if we partition the array into 2 subArrays with equal sum

        int[] arr={5,3,2,6,3,1};
        System.out.println(subArrayWithEqualSum(arr));

    }
}
