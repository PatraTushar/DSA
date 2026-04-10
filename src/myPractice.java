import java.util.Arrays;
import java.util.Stack;

public class myPractice {

    static int[] prevSmallerElement(int[] arr) {

        //  Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] PSE = new int[n];

        PSE[0] = -1;
        st.push(arr[0]);

        for (int i = 1; i < n; i++) {

            if (!st.isEmpty() && st.peek() < arr[i]) PSE[i] = st.peek();

            else {

                while (!st.isEmpty() && st.peek() >= arr[i]) {

                    st.pop();
                }

                PSE[i] = st.isEmpty() ? -1 : st.peek();

            }
            st.push(arr[i]);
        }

        return PSE;

    }


    public static void main(String[] args) {

        int[] arr1 = {4, 1, 2};
        int[] ans = prevSmallerElement(arr1);
        System.out.println(Arrays.toString(ans));

    }


}





