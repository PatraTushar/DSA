import java.util.Arrays;
import java.util.Stack;

public class myPractice {

    static int[] asteroidCollision(int[] arr) {


        Stack<Integer> st = new Stack<>();


        for (int ele : arr) {

            boolean isCurrentDestroyed = false;

            while (!st.isEmpty() && ele < 0 && st.peek() > 0) {

                if (Math.abs(st.peek()) < Math.abs(ele)) {

                    st.pop();
                } else if (Math.abs(st.peek()) > Math.abs(ele)) {

                    isCurrentDestroyed=true;
                    break;
                }

                else {

                    st.pop();
                    isCurrentDestroyed=true;
                    break;
                }

            }

            if(!isCurrentDestroyed) st.push(ele);




        }


        int[] res=new int[st.size()];
        int length=res.length;

        for (int i=length-1;i>=0;i--){
            res[i]=st.pop();
        }


        return res;


    }


    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 1, 2, -3, -7, 17, 15, -16};
        int[] ans = asteroidCollision(arr);
        System.out.println(Arrays.toString(ans));


    }


}





