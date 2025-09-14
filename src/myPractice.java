public class myPractice {


    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) {

                max = ele;
            }


        }

        return max;
    }

    static int findSum(int[] arr) {

        int sum = 0;
        for (int ele : arr) {

            sum += ele;


        }

        return sum;
    }

    static int isValid(int[] boards, int maxTime) {

        int initialBoard = 0;
        int initialPainter = 1;

        for (int ele : boards) {


            if (initialBoard + ele <= maxTime) {

                initialBoard += ele;
            } else {

                initialPainter++;
                initialBoard = ele;
            }


        }


        return initialPainter;


    }


    static int painterPartition(int[] boards, int numPainters) {

        if (numPainters > boards.length) return -1;

        int start = findMax(boards);
        int end = findSum(boards);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int paintersNeeded = isValid(boards, mid);


            if (paintersNeeded > numPainters) {

                start = mid + 1;

            } else end = mid - 1;


        }

        return start;


    }

    public static void main(String[] args) {

        int[] arr = {25, 46, 28, 49, 24};
        int k = 4;
        System.out.println(painterPartition(arr, k));


    }
}











