import java.util.Arrays;
import java.util.Stack;

public class myPractice {

    static int[] nge(int[] arr) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] NGE = new int[n];

        NGE[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            if (!st.isEmpty() && st.peek() > arr[i]) NGE[i] = st.peek();

            else {

                while (!st.isEmpty() && st.peek() <= arr[i]) {

                    st.pop();
                }

                NGE[i] = st.isEmpty() ? -1 :st.peek();

            }
            st.push(arr[i]);
        }

        return NGE;

    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = nge(arr);
        System.out.println(Arrays.toString(res));

    }


}





