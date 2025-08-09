package OopsByKK.AnonymousInnerClass;


// Anonymous innerclass Implementing An Interface

interface Greeting{

    void sayHello();


}
public class ImplementingAnInterface {

    public static void main(String[] args) {

        Greeting g=new Greeting() {
            @Override
            public void sayHello() {
                System.out.println(" Hello world ");
            }
        };

        g.sayHello();

    }
}
