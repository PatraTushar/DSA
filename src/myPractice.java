import java.util.Stack;

public class myPractice {

    static Stack<Integer> push(int[] arr, int n) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) st.push(arr[i]);

            else {

                if (arr[i] < st.peek()) st.push(arr[i]);

                else st.push(st.peek());
            }

        }

        return st;

    }

    static void getMin(Stack<Integer> st) {

        while (!st.isEmpty()) {

            System.out.print(st.pop() + " " );
        }


    }


    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 0, 6};
        int n = 6;
        Stack<Integer> st = push(arr, n);
        getMin(st);


    }
}













