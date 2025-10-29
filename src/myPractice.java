public class myPractice {

    static int func(int[] arr, int k) {

        int n = arr.length;
        int totalSubArray = 0;

        for (int i = 0; i < n; i++) {

            int count=0;

            for (int j = i; j < n; j++) {

                if (arr[j] % 2 != 0 ) count++;

                if (k == count) {

                    totalSubArray++;


                }

                else if(count > k) break;




            }
        }

        return totalSubArray;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int goal = 1;
        System.out.println(func(arr, goal));


    }


}

