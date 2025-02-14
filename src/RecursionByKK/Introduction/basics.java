package RecursionByKK.Introduction;

public class basics {

    static void message1(){
        System.out.println(" hello world ");
        message2();
    }

    static void message2(){
        System.out.println(" hello world ");
        message3();
    }

    static void message3(){
        System.out.println(" hello world ");
        message4();
    }

    static void message4(){
        System.out.println(" hello world ");
        message5();
    }

    static void message5(){
        System.out.println(" hello world ");
    }




    public static void main(String[] args) {
        // printing hello world 5 times by calling a function once
        message1();


    }
}
