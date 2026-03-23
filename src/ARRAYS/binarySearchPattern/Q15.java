package ARRAYS.binarySearchPattern;

public class Q15 {

    static int getMaxBoardLength(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) {

                max = ele;
            }


        }

        return max;
    }

    static int getTotalBoardLength(int[] arr) {

        int sum = 0;
        for (int ele : arr) {

            sum += ele;


        }

        return sum;
    }

    static int countPainters(int[] boards, int maxTime) {

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

        // Time Complexity: O(n)+O(n)+O(n⋅log(sum−max))=O(n⋅log(sum−max))
        // Space Complexity: O(1)

        if (numPainters > boards.length) return -1;

        int start = getMaxBoardLength(boards);
        int end = getTotalBoardLength(boards);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int paintersNeeded = countPainters(boards, mid);


            if (paintersNeeded > numPainters) {

                start = mid + 1;

            } else end = mid - 1;


        }

        return start;


    }

    public static void main(String[] args) {

        // Painter Partition Problem

        int[] boards = {10, 20, 10, 10};
        int painter = 2;
        System.out.println(painterPartition(boards, painter));
    }
}
