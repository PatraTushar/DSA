package OopsByKK.AnonymousInnerClass;

// Capturing Variables from Outer Scope
public class Demo3 {

    public static void main(String[] args) {

        String msg="Hello";

        Runnable r=new Runnable() {
            @Override
            public void run() {

                System.out.println(msg);

            }
        };

        r.run();




    }
}
