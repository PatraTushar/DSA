import java.util.Arrays;
import java.util.Stack;


public class myPractice {

    static int[] stockSpanner(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] sSpan = new int[n];

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {


                st.pop();


            }

            sSpan[i] = st.isEmpty() ? i + 1 : (i - st.peek());

            st.push(i);

        }

        return sSpan;
    }


    public static void main(String[] args) {


        int[] stock = {100, 80, 60, 70, 60, 75, 85};
        int[] ans=stockSpanner(stock);
        System.out.println(Arrays.toString(ans));


    }
}













