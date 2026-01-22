package MultithreadingAndConcurrency.multiThreadingEnhancement;

class CustomerThread extends Thread {

    static int customerID;

    private static ThreadLocal tl = new ThreadLocal() {

        protected Integer initialValue() {
            return ++customerID;
        }
    };

    CustomerThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " executing with customerID " + tl.get());
    }
}

public class ThreadLocalDemoB {

    public static void main(String[] args) {

        CustomerThread t1=new CustomerThread(" customer Therad : 1 ");
        CustomerThread t2=new CustomerThread(" customer Therad : 2 ");
        CustomerThread t3=new CustomerThread(" customer Therad : 3 ");
        CustomerThread t4=new CustomerThread(" customer Therad : 4 ");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
