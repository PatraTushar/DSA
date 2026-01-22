package MultithreadingAndConcurrency.multiThreadingEnhancement;

// overriding of initialvalue() method
public class ThreadLocalDemoA {

    public static void main(String[] args) {

        ThreadLocal tl=new ThreadLocal(){

            public Object initialValue(){

                return "abc";
            }
        };

        System.out.println(tl.get());  // abc

        tl.set("Rohit");
        System.out.println(tl.get());  // Rohit

        tl.remove();
        System.out.println(tl.get());  // abc
    }
}
