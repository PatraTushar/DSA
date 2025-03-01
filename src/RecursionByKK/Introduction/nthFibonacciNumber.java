package RecursionByKK.Introduction;



public class nthFibonacciNumber {

    static void printAllFibonacciNumbers(int a,int b,int n){
        if(n==0) return;
        System.out.print(a +" ");
        printAllFibonacciNumbers(b,a+b,n-1);
    }

    static int fibonacci(int n){

        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);



    }

    public static void main(String[] args) {
        int ans=fibonacci(4);
        System.out.println(ans);
        printAllFibonacciNumbers(0,1,4);






    }
}
