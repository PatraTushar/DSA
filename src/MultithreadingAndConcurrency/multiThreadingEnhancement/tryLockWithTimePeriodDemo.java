package MultithreadingAndConcurrency.multiThreadingEnhancement;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class myThreadC extends Thread {


    static ReentrantLock l = new ReentrantLock();

    myThreadC(String name) {
        super(name);
    }

    @Override
    public void run() {

        do {

            try {

                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {

                    System.out.println(Thread.currentThread().getName() + " got the lock ");
                    Thread.sleep(30000);
                    l.unlock();

                    System.out.println(Thread.currentThread().getName() + " releases the lock ");
                    break;
                } else {

                    System.out.println(Thread.currentThread().getName() + " unable to get the lock and will try again ");
                }

            } catch (InterruptedException e) {
            }


        } while (true);
    }
}

public class tryLockWithTimePeriodDemo {

    public static void main(String[] args) {

        myThreadC t1=new myThreadC(" First Thread ");
        myThreadC t2=new myThreadC(" Second Thread ");

        t1.start();
        t2.start();

    }
}
