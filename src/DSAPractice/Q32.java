package DSAPractice;

public class Q32 {

    static int findMax(int[] books) {

        int max = Integer.MIN_VALUE;

        for (int book : books) {

            if (book > max) max = book;
        }

        return max;
    }

    static int findSum(int[] books) {

        int sum = 0;

        for (int book : books) {

            sum += book;
        }

        return sum;
    }

    static int canBookAllocate(int[] books, int students, int target) {

        int allowedStudent = 1;
        int booksDividedAmongStudent = 0;

        for (int book : books) {

            booksDividedAmongStudent += book;

            if (booksDividedAmongStudent > target) {

                allowedStudent++;
                booksDividedAmongStudent = book;
            }

        }

        return allowedStudent;
    }

    static int allocateBooks(int[] books, int students) {

        int n = books.length;

        if (students > n) return -1;


        int low = findMax(books);
        int high = findSum(books);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int studentAllocated = canBookAllocate(books, students, mid);

            if (studentAllocated > students) low = mid + 1;
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
