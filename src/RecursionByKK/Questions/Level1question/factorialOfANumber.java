package RecursionByKK.Questions.Level1question;

public class factorialOfANumber {

    static int factorial(int n){

        if(n==1 || n==0){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        int ans=factorial(5);
        System.out.println(ans);


    }
}
