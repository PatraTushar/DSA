import java.util.Stack;

public class myPractice {


    static int[] findPSE(int[] arr) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] pse = new int[n];

        st.push(0);
        pse[0] = -1;

        for (int i = 1; i < n; i++) {

            if (arr[st.peek()] <= arr[i]) {

                pse[i] = st.peek();
            } else {

                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) pse[i] = st.peek();
                else pse[i] = -1;
            }

            st.push(i);

        }

        return pse;


    }


    static int[] findNSE(int[] arr) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];

        st.push(n - 1);
        nse[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {

            if (arr[st.peek()] < arr[i]) {

                nse[i] = st.peek();
            } else {

                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {

                    st.pop();
                }

                if (!st.isEmpty()) nse[i] = st.peek();
                else nse[i] = n;
            }

            st.push(i);

        }

        return nse;

    }


    static int sumOfSubArrayMinimums(int[] arr) {

        int n = arr.length;
        int MOD = (int) 1e9 + 7;
        int[] pse = findPSE(arr);
        int[] nse = findNSE(arr);

        long sum = 0;


        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;
            sum = (sum + arr[i] * left * right) % MOD;


        }

        return (int) sum;

    }


    public static void main(String[] args) {

        int[] arr = {71,55,82,55};
        System.out.println(sumOfSubArrayMinimums(arr));


    }
}













