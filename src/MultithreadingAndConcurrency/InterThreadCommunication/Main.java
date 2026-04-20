package MultithreadingAndConcurrency.InterThreadCommunication;

class Shared {

    synchronized void produce() {
        System.out.println(Thread.currentThread().getName() + " producing...");

        try {
            wait(); // releases lock and goes to waiting state
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() + " resumed after notify");
    }

    synchronized void consume() {
        System.out.println(Thread.currentThread().getName() + " consuming...");

        notify(); // wakes up waiting thread

        System.out.println(Thread.currentThread().getName() + " sent notification");
    }
}


class Producer extends Thread {
    Shared obj;

    Producer(Shared obj) {
        this.obj = obj;
    }

    public void run() {
        obj.produce();
    }
}

class Consumer extends Thread {
    Shared obj;

    Consumer(Shared obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            Thread.sleep(1000); // ensure producer runs first
        } catch (Exception e) {}

        obj.consume();
    }
}


public class Main {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }
}


//“When a thread enters a synchronized method or block, it acquires the lock, and synchronization comes into play.”

//“After notify() is called, the waiting thread does NOT execute immediately. It only gets moved from WAITING state to BLOCKED state,
// and it will resume execution only after the current thread releases the lock.”