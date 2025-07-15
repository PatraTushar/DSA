package RecursionByStriver.Questions.Level1question;

public class productOfDigits {

    static int product(int n){
        int product=1;
        while(n>0){

            int rem=n%10;
            product*=rem;
            n=n/10;


        }

        return product;
    }

    static int productUsingRecursion(int n){

        if(n<=0) return 1;

        return productUsingRecursion(n/10) * (n%10);
    }

    public static void main(String[] args) {
        int n=1342;
       // System.out.println(product(n));
        System.out.println(productUsingRecursion(n));
    }
}
