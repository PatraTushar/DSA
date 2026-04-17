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





    public static void main(String[] args) {


    }


}





