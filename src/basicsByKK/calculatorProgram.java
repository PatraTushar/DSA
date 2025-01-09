package basicsByKK;

import java.util.Scanner;

public class calculatorProgram {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true){


            System.out.println(" enter the operator ");
            char ch=sc.next().trim().charAt(0);
            int ans=0;

            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){

                System.out.println(" enter 2 numbers ");
                int num1=sc.nextInt();
                int num2=sc.nextInt();

                if(ch=='+'){
                    ans=num1+num2;
                }

                if(ch=='-'){
                    ans=num1-num2;
                }

                if(ch=='*'){
                    ans=num1*num2;
                }

                if(ch=='/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                }

                if(ch=='%'){
                    ans=num1%num2;
                }
            }

            else if(ch=='x' || ch=='X'){
                break;
            }

            else {
                System.out.println(" invalid operations ");
            }

            System.out.println(ans);
        }




    }
}
