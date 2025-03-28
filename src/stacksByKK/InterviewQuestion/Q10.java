package stacksByKK.InterviewQuestion;

import OopsByKK.AccessModifier.Public.A;

import java.util.*;

public class Q10 {

    static int[] nextGreaterElementI(int[] num1,int[] num2){

        Stack<Integer> st=new Stack<>();
        int m=num1.length;
        int n=num2.length;
        int[] result=new int[m];
        int[] map=new int[10001];
        map[num2[n-1]]=-1;
        st.push(num2[n-1]);

        for(int i=n-2;i>=0;i--){

            while(!st.isEmpty() && num2[i]>st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                map[num2[i]]=-1;
            }

            else{
                map[num2[i]]=st.peek();
            }

            st.push(num2[i]);
        }

        for(int i=0;i<m;i++){
            result[i]=map[num1[i]];
        }


        return result;




    }


    public static void main(String[] args) {

        int[] num1={4,1,2};
        int[] num2={1,3,4,2};

        int[] Ans=nextGreaterElementI(num1,num2);
        System.out.println(Arrays.toString(Ans));



    }
}
