import java.util.Stack;

public class myPractice {

    static int sumOfSubArrayMin(int[] arr) {

        int length = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[length];
        int[] nse = new int[length];
        int MOD = (int) 1e9 + 7;


        for (int i = 0; i < length; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {

                st.pop();

            }


            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);

        }


        st.clear();


        for (int i = length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? length : st.peek();
            st.push(i);


        }


        long sum = 0;

        for (int i = 0; i < length; i++) {

            long left=i-pse[i];
            long right=nse[i]-i;
            sum=(sum+arr[i]*left*right)%MOD;

        }

        return (int) sum;

    }


    public static void main(String[] args) {

        int[] num = {3, 1, 2, 4};
        System.out.println(sumOfSubArrayMin(num));


    }


}





