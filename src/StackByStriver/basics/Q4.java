package StackByStriver.basics;

import java.util.Stack;

public class Q4 {

    static void display(Stack<Integer> st){

        //Time Complexity: O(n)
        //Space Complexity: O(n)



            Stack<Integer> temp=new Stack<>();
            while (!st.isEmpty()){
                temp.push(st.pop());
            }

            while (!temp.isEmpty()){
                int x=temp.pop();
                System.out.print(x +" ");
                st.push(x);
            }







    }

    static void displayUSingArray(Stack<Integer> st){

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        int n=st.size();
        int[] arr=new int[n];

        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
            st.push(arr[i]);
        }




    }



    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        display(st);
        System.out.println();
        displayUSingArray(st);


    }
}
