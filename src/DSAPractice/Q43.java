package DSAPractice;

public class Q43 {

    static int missingNumber(int[] arr) {

        int n = arr.length;

        int nth = n * (n + 1) / 2;

        int sum=0;

        for (int ele:arr){

            sum+=ele;
        }

        return nth-sum;



    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
}
