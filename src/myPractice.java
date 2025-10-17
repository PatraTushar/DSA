import java.util.Arrays;
import java.util.Stack;

public class myPractice {


    static int[] asteroidCollision(int[] asteroids) {

        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        if (n == 0) return new int[0];

        for (int ele : asteroids) {

            boolean destroyed = false;

            while (!st.isEmpty() && ele < 0 && st.peek() > 0) {

                if (Math.abs(st.peek()) < Math.abs(ele)) {

                    st.pop();


                } else if (Math.abs(st.peek()) > Math.abs(ele)) {

                    destroyed = true;
                    break;


                } else {

                    destroyed = true;
                    st.pop();
                    break;

                }


            }


            if (!destroyed) st.push(ele);

        }


        int length = st.size();
        int[] result = new int[length];
        for (int i = length - 1; i >= 0; i--) {

            result[i] = st.pop();

        }

        return result;
    }


    public static void main(String[] args) {

        int[] asteroids = {4, 7, 1, 1, 2, -3, -7, 17, 15, -16};
        int[] ans = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(ans));


    }
}













