package ARRAYS.binarySearchPattern;

public class Q14 {

    static int getMaxPages(int[] num) {

        int max = Integer.MIN_VALUE;

        for (int ele : num) {

            max = Math.max(max, ele);
        }

        return max;
    }


    static int getTotalPages(int[] num) {

        int sum = 0;

        for (int ele : num) {

            sum += ele;
        }

        return sum;
    }


    static int countStudents(int[] num, int pages) {

        int students = 1;
        int sum = 0;

        for (int ele : num) {

            sum += ele;

            if (sum > pages) {

                students++;
                sum = ele;

            }


        }

        return students;


    }


    static int allocateBooks(int[] arr, int k) {

        int n = arr.length;

        if (k > n) return -1;

        int low = getMaxPages(arr);
        int high = getTotalPages(arr);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int totalStudent = countStudents(arr, mid);

            if (totalStudent > k) low = mid + 1;

            else high = mid - 1;


        }

        return low;


    }




    public static void main(String[] args) {

        int[] books = {25, 46, 28, 49, 24};
        int students = 4;
        System.out.println(allocateBooks(books, students));


    }


}


