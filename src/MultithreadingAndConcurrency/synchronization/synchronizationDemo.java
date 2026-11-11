package MultithreadingAndConcurrency.synchronization;

// IN Main.java we wrote the same code using 3 different classes here we wrote using a single class .
class DisplayDemo {

    synchronized void syncMethod() {

        System.out.println(Thread.currentThread().getName() + " entered sync method ");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        System.out.println(Thread.currentThread().getName() + " exit sync method ");

    }


    void normalMethod() {

        System.out.println(Thread.currentThread().getName() + " executing normal method ");
    }
}


class myThread11 extends Thread {

    DisplayDemo d;
    boolean isSynchronized;

    myThread11(DisplayDemo d, boolean isSynchronized) {
        this.d = d;
        this.isSynchronized=isSynchronized;
    }

    @Override
    public void run() {

        if (isSynchronized) {
            d.syncMethod();
        } else d.normalMethod();
    }
}

public class synchronizationDemo {


    public static void main(String[] args) {
        DisplayDemo d = new DisplayDemo();
        myThread11 t1 = new myThread11(d,true);
        myThread11 t2 = new myThread11(d,true);
        myThread11 t3 = new myThread11(d,false);

        t1.start();
        t2.start();
        t3.start();
    }
}
