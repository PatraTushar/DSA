package RecursionByKK.Questions.Level1question;

public class PrintFromNto1 {

    static void print(int n){

        if(n==1){

            System.out.println(n);
            return;

        }


        System.out.println(n);
        print(n-1);

    }

    public static void main(String[] args) {

        print(5);


    }
}
