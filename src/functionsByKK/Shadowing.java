package functionsByKK;

public class Shadowing {

   static int x=90;   // This will be shadowed at line 11

    public static void main(String[] args) {

        System.out.println(x);  //90
         int x=40;                       // scope will begin when the value is initialized
        System.out.println(x);  //40
        fun();

    }

    static void fun(){
        System.out.println(x);  //90
    }
}
