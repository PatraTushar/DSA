package RecursionByStriver.Questions.Level1question;

public class sumOfNTo1 {

    static int sum(int n){

        if(n==1) return n;

        return n + sum(n-1);
    }

    public static void main(String[] args) {

        System.out.println(sum(5));


    }
}
