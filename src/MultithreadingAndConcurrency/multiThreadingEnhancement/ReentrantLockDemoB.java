package MultithreadingAndConcurrency.multiThreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

class myThreadB extends Thread {

    static ReentrantLock l = new ReentrantLock();

    myThreadB(String name) {

        super(name);
    }

    @Override
    public void run() {

        if (l.tryLock()) {

            System.out.println(Thread.currentThread().getName() + " Got lock and performing some operations ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            l.unlock();
        } else {

            System.out.println(Thread.currentThread().getName() + " unable to get lock and hence performing alternative operations" +
                    "");

        }
    }
}

public class ReentrantLockDemoB {

    public static void main(String[] args) {

        myThreadB t1 = new myThreadB(" First Thread ");
        myThreadB t2 = new myThreadB(" Second Thread ");
        t1.start();
        t2.start();


    }
}


// “There is only one ReentrantLock for the whole class, shared by all instances.”
//All objects (t1, t2, …) refer to the same lock.
//This ensures that when one thread acquires the lock, other threads have to wait or fail (tryLock()) — proper synchronization.
//If l were not static, each thread would have its own lock, and they could all enter the critical section simultaneously, which defeats the purpose of using a lock.
//In short: Static lock = shared among all objects of the class.
