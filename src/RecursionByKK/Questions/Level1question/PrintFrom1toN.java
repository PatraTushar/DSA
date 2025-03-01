package RecursionByKK.Questions.Level1question;

public class PrintFrom1toN {
    static void print(int n){

        if(n==5){
            System.out.println(n);
            return;
        }


        System.out.println(n);
        print(n+1);



    }

    public static void main(String[] args) {

        print(1);



    }
}
