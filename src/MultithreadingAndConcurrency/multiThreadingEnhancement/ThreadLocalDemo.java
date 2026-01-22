package MultithreadingAndConcurrency.multiThreadingEnhancement;

public class ThreadLocalDemo {

    public static void main(String[] args) {

        ThreadLocal tl=new ThreadLocal();
        System.out.println(tl.get());  // null

        tl.set("Tushar");
        System.out.println(tl.get()); // Tushar

        tl.remove();
        System.out.println(tl.get());  // null

    }
}
