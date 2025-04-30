package stacksByKK.Infix;

import java.util.Stack;

public class infixEvaluation {

    static int InfixEvaluationI(String str) {  // without brackets

        Stack<Integer> val = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // '0'->48  and '9'->57

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (operator.size() == 0) {
                operator.push(ch);

            } else {

                if (ch == '+' || ch == '-') {

                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (operator.peek() == '-') val.push(v1 - v2);
                    else if (operator.peek() == '+') val.push(v1 + v2);
                    else if (operator.peek() == '*') val.push(v1 * v2);
                    else if (operator.peek() == '/') val.push(v1 / v2);

                    operator.pop();
                    operator.push(ch);


                }

                if (ch == '*' || ch == '/') {

                    if (operator.peek() == '*' || operator.peek() == '/') {

                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (operator.peek() == '*') val.push(v1 * v2);
                        else if (operator.peek() == '/') val.push(v1 / v2);
                        operator.pop();
                        operator.push(ch);

                    }
                    else {
                        operator.push(ch);
                    }


                }

            }



        }





        while (val.size()>1){

            int v2=val.pop();
            int v1=val.pop();
            if (operator.peek() == '-') val.push(v1 - v2);
            else if (operator.peek() == '+') val.push(v1 + v2);
            else if (operator.peek() == '*') val.push(v1 * v2);
            else if (operator.peek() == '/') val.push(v1 / v2);
            operator.pop();





        }

        return val.peek();




    }

    static int InfixEvaluationII(String str){  // with bracket

        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            int ascii=(int) ch;


            if(ascii>=48 && ascii<=57){

                val.push(ascii-48);
            }
            else if (op.size()==0 || ch=='(' ||  op.peek()=='(') {
                op.push(ch);

            }

            else {

                if(ch=='+' || ch=='-'){

                    int v2=val.pop();
                    int v1=val.pop();

                    if(op.peek()=='+')val.push(v1+v2);
                    else if(op.peek()=='-')val.push(v1-v2);
                    else if(op.peek()=='*')val.push(v1*v2);
                    else  if(op.peek()=='/')val.push(v1/v2);
                    op.pop();
                    op.push(ch);

                }

                else if(ch==')'){
                    while (op.peek()!='('){
                        int v2=val.pop();
                        int v1=val.pop();
                        if(op.peek()=='+')val.push(v1+v2);
                        else if(op.peek()=='-')val.push(v1-v2);
                        else if(op.peek()=='*')val.push(v1*v2);
                        else  if(op.peek()=='/')val.push(v1/v2);
                        op.pop();


                    }


                    op.pop();   // '(' hata do
                }

                else if(ch=='*' || ch=='/'){

                    if(op.peek()=='*' || op.peek()=='/'){

                        int v2=val.pop();
                        int v1=val.pop();

                        if(op.peek()=='*')val.push(v1*v2);
                        else  if(op.peek()=='/')val.push(v1/v2);
                        op.pop();
                        op.push(ch);

                    }



                    else {

                        op.push(ch);
                    }
                }



            }
        }


        while (val.size()>1){
            int v2=val.pop();
            int v1=val.pop();


            if(op.peek()=='+')val.push(v1+v2);
            else if(op.peek()=='-')val.push(v1-v2);
            else if(op.peek()=='*')val.push(v1*v2);
            else  if(op.peek()=='/')val.push(v1/v2);

            op.pop();


        }

        return val.peek();


    }



    public static void main(String[] args) {

        String str1="9-5+3*4/6";
        String str2="9-(5+3)*4/6";

        System.out.println(InfixEvaluationI(str1)); //6
        System.out.println(InfixEvaluationII(str2)); //4


    }
}
