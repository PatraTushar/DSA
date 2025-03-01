package RecursionByKK.Questions.Level1question;

public class Palindrome {

    static int  reverse(int n,int rev){

        if(n==0) return rev;
        return reverse (n/10,rev*10+(n%10));


    }

//    static boolean palindrome(int n){
//        int a=n;
//        int ans=0;
//        while(n>0){
//
//            int rem=n%10;
//            ans=(ans*10)+rem;
//            n=n/10;
//
//        }
//
//        return ans==a;
//    }

    static boolean palindromeUsingRecursion(int n){

        return n==reverse(n,0);


    }

    public static void main(String[] args) {
        int n=121;
        System.out.println(palindromeUsingRecursion(n));

    }
}
