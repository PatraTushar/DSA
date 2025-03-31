import java.util.Arrays;
import java.util.Stack;


public class practice {


    static int[] stockSpan(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        st.push(0);
        res[0] = 1;

        for (int i = 1; i < n; i++) {

            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }


            if (!st.isEmpty()) {
                res[i] = i - st.peek();
            } else {
                res[i] = i + 1;
            }

            st.push(i);


        }


        return res;

    }


    public static void main(String[] args) {

        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] ans = stockSpan(arr);
        System.out.println(Arrays.toString(ans));


    }


}
