
class Display {

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


class myThread1 extends Thread {

    Display d;
    boolean isSynchronized;

    myThread1(Display d,boolean isSynchronized) {
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


public class mainClass {


    public static void main(String[] args) {

        Display d = new Display();
        myThread1 t1 = new myThread1(d,true);
        myThread1 t2 = new myThread1(d,true);
        myThread1 t3 = new myThread1(d,false);

        t1.start();
        t2.start();
        t3.start();


    }
}


