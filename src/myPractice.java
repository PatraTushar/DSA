public class myPractice {


    static int findSqrRoot(int x) {

        int start = 1;
        int end = x;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int sqrMid = mid * mid;

            if (sqrMid == x) return mid;

            else if (sqrMid > x) end = mid - 1;

            else start = mid + 1;

        }

        return end;

    }


    public static void main(String[] args) {


        int x = 4;
        System.out.println(findSqrRoot(x));


    }
}











