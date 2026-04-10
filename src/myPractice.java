import java.util.Arrays;
import java.util.Stack;

public class myPractice {

    static int[] nse(int[] arr) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] NSE = new int[n];

        NSE[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (!st.isEmpty() && st.peek() < arr[i]) NSE[i] = st.peek();

            else {

                while (!st.isEmpty() && st.peek() >= arr[i]) {

                    st.pop();
                }

                NSE[i] = st.isEmpty() ? -1 :st.peek();

            }
            st.push(arr[i]);
        }

        return NSE;

    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = nse(arr);
        System.out.println(Arrays.toString(res));

    }


}





