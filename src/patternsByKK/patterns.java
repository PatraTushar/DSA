package patternsByKK;

import java.util.Scanner;

public class patterns {

    static void pattern1(int n){

        for(int i=0;i<n;i++){

            for(int j=i+1;j>0;j--){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern3(int n){

        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }

            System.out.println();
        }


    }

    static void pattern4(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++) {

                System.out.print(j);


            }
            System.out.println();
        }
    }

    static void pattern5(int n){

        for(int i=0;i<n;i++){
            if(i<=n/2){

                for(int j=i+1;j>0;j--){
                    System.out.print("*");
                }

                System.out.println();

            }

           else{

            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
                System.out.println();
            }

        }
    }

    static void pattern6(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){

                System.out.print(" ");

            }

            for(int k=1;k<=i;k++){

                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern7(int n){

        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=i;k<n;k++){
                System.out.print("*");
            }



            System.out.println();
        }


    }

    static void pattern8(int n){

        for(int i=1;i<=n;i++){

            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }

                for(int k=1;k<=i*2-1;k++){
                    System.out.print("*");
                }

                for(int l=0;l<n-i;l++){
                    System.out.print(" ");
                }


            System.out.println();
        }

    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter n ");
        int n=sc.nextInt();
       // pattern1(n);
       // pattern2(n);
        //pattern3(n);
        //pattern4(n);
        //pattern5(n);
       // pattern6(n);
       // pattern7(n);
        pattern8(n);


    }
}
