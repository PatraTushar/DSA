package OOPS.AccessModifier.Public;

public class main {

    public static void main(String[] args) {
        A obj=new A(10,20,30);
        System.out.println(obj.length);

        B obj2=new B(100,200,300,400);
        System.out.println(obj2.length);
    }
}
