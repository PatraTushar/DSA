package RecursionByStriver.Questions.Level1question;

public class sumOfDigits {


    // without recursion
    static int sum(int n){

        int sum=0;

        while (n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }

        return sum;
    }

    static int sumUsingRecursion(int n){

        if(n<=0) return 0;

        return sumUsingRecursion(n/10)+n%10;


    }

    public static void main(String[] args) {

        int n=1342;
      //  System.out.println(sum(n));
        System.out.println(sumUsingRecursion(n));

    }
}
