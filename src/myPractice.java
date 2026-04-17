import java.util.Stack;

public class myPractice {


    static int[] NGE(int[] arr) {

        int length = arr.length;
        int[] nge = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {

                st.pop();
            }


            nge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return nge;


    }


    static int[] NSE(int[] arr) {

        int length = arr.length;
        int[] nse = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {

                st.pop();
            }


            nse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return nse;


    }


    static int[] PGE(int[] arr) {

        int length = arr.length;
        int[] pge = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {

                st.pop();
            }


            pge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return pge;


    }


    static int[] PSE(int[] arr) {

        int length = arr.length;
        int[] pse = new int[length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {

                st.pop();
            }


            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return pse;


    }


    static int sumOfSubArrayMinimums(int[] arr) {


        int length = arr.length;
        int MOD = (int) 1e9 + 7;
        int[] pse = new int[length];
        int[] nse = new int[length];
        Stack<Integer> st = new Stack<>();


        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {

                st.pop();
            }


            nse[i] = st.isEmpty() ? length : st.peek();

            st.push(i);


        }

        st.clear();


        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {

                st.pop();
            }


            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);


        }


        long res = 0;

        for (int i = 0; i < length; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;

            res = (res + left * right * arr[i]) % MOD;
        }

        return (int) res;


    }


    static int sumOfSubArrayMaximums(int[] arr) {


        int length = arr.length;
        int MOD = (int) 1e9 + 7;
        int[] pge = new int[length];
        int[] nge = new int[length];
        Stack<Integer> st = new Stack<>();


        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {

                st.pop();
            }


            pge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);


        }

        st.clear();


        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                st.pop();
            }


            nge[i] = st.isEmpty() ? length : st.peek();

            st.push(i);


        }








        long res = 0;

        for (int i = 0; i < length; i++) {

            long left = i - pge[i];
            long right = nge[i] - i;

            res = (res + left * right * arr[i]) % MOD;
        }

        return (int) res;


    }


    public static void main(String[] args) {

        int[] num = {3, 1, 2, 4};
         System.out.println(sumOfSubArrayMinimums(num));
        System.out.println(sumOfSubArrayMaximums(num));


    }


}





