package RecursionByKK.Questions.Level1question;

public class Concept {

    static void fun(int n){

        if(n==0) return;

        System.out.println(n);
       // fun(n--);    it will not work  it will give error
        fun(--n);

    }

    public static void main(String[] args) {

        fun(5);

    }
}
