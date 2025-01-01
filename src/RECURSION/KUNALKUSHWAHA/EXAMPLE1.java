package RECURSION.KUNALKUSHWAHA;

public class EXAMPLE1 {

    // print first five numbers :  1 2 3 4 5

    static void print1(int n){

        System.out.println(n);
        print2(2);

    }

    static void print2(int n){

        System.out.println(n);
        print3(3);

    }
    static void print3(int n){

        System.out.println(n);
        print4(4);

    }
    static void print4(int n){

        System.out.println(n);
        print5(5);

    }
    static void print5(int n){

        System.out.println(n);

    }


    //  print first five numbers :  1 2 3 4 5   using recursion
    static void print(int n){

        if(n==5)
        {

            System.out.println(5);
            return ;
        }
        System.out.println(n);
        print(n + 1);
    }

    public static void main(String[] args) {


       // print1(1);
        print(1);
        
    }
}
