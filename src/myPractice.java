import java.util.Stack;

public class myPractice {

    static int precedence(char op){

        if(op=='+' || op=='-') return 1;
        else if(op=='*' || op=='/') return 2;
        else if(op=='^') return 3;
        else return 0;
    }

    static String postfix(String infix    ){

        Stack<Character> st=new Stack<>();
        String ans="";
        int i=0;
        int n=infix.length();

        while (i<n){

            char ch=infix.charAt(i);

            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                ans+=ch;

            }

            else if(ch=='('){

                st.push(ch);
            }

            else if(ch==')'){

                while (!st.isEmpty() && st.peek()!='('){
                    ans+=st.pop();
                }

                st.pop();
            }

            else {

                while (!st.isEmpty() && precedence(st.peek())>=precedence(ch)){

                    ans+=st.pop();
                }

                st.push(ch);
            }

            i++;





        }


        while (!st.isEmpty()){
            ans+=st.pop();
        }

        return ans;


    }

    public static void main(String[] args) {

        String infix="a+b*(c^d-e)";
        System.out.println(postfix(infix));


    }





    }






