package ArraysbyKK.strivers;

public class Q5 {

    static int missingNumber(int[] arr){

        int n=arr.length;

        int totalSum=n*(n+1)/2;

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        int missing=totalSum-sum;
        return missing;
    }

    public static void main(String[] args) {

        // missing number (leeTCode->268)

        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
