package OOPS.staticExample;

public class practice {

    static void fun(){

       practice obj=new practice();
       obj.greeting();

    }

     void greeting(){
        System.out.println(" hello world ");

    }

    void fun2(){
        greeting();
    }

    public static void main(String[] args) {

        fun();
        practice A=new practice();
        A.fun2();




    }
}
