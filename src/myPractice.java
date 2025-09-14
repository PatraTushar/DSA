public class myPractice {

    static int rotationalCount(int[] num) {

        int start = 0;
        int end = num.length - 1;

        while (start != end) {

            int mid = start + (end - start) / 2;


            if (num[start] >= num[end] && num[start] <= num[mid]) {

                start = mid + 1;

            } else end = mid;


        }

        return end;

    }
        public static void main (String[]args){

            int[] num = {3,4,5,1,2};
            System.out.println(rotationalCount(num));

        }
    }











