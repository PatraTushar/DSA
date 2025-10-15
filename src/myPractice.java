import java.util.Arrays;
import java.util.Stack;

public class myPractice {


    static int[] previousGreaterElement(int[] arr) {

        int n = arr.length;
        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();

        pge[0] = -1;
        st.push(arr[0]);

        for (int i = 1; i < n; i++) {

            if (st.peek() > arr[i]) {

                pge[i] = st.peek();
                st.push(arr[i]);

            } else {


                while (!st.isEmpty() && st.peek() <= arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) pge[i] = st.peek();
                else pge[i] = -1;
                st.push(arr[i]);

            }


        }

        return pge;

    }


    public static void main(String[] args) {

        int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        int[] ans = previousGreaterElement(arr);
        System.out.println(Arrays.toString(ans));


    }
}













