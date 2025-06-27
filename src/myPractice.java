import java.util.Stack;

public class myPractice {

    static int[] nextGreaterElementII(int[] nums){

        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[nums.length];

        for(int i=2*n-1;i>=0;i--){

            while (!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }

            if(st.isEmpty()) nge[i%n]=-1;
            else nge[i%n]=st.peek();
            st.push(nums[i%n]);
        }

        return nge;

    }




    public static void main(String[] args) {




    }


}