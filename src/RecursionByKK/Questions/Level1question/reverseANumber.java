package RecursionByKK.Questions.Level1question;

public class reverseANumber {

    static void reverse(int n){

        while(n>0){
            int rem=n%10;
            n=n/10;
            System.out.print(rem);

        }

    }

    static void reverseUsingRecursion(int n){
        if(n==0) return;

        System.out.print(n%10);
        reverseUsingRecursion(n/10);
    }

    static int REVERSE(int n,int rev){

        // input -----  output
        // 12300 ------ 321

        if(n==0) return rev;

        return REVERSE(n/10,rev*10+(n%10));




    }

    public static void main(String[] args) {

        int n=12300;
        reverse(n);
        System.out.println();
        reverseUsingRecursion(n);
        System.out.println();
        System.out.println(REVERSE(n,0));
    }
}
