package MultithreadingAndConcurrency.synchronization;


class DisplayD {

    public void wish(String name) {


        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ; // 1 lakhs line of code

        // 10 lakh lines of code → runs concurrently in both threads (no lock here)

        synchronized (this) {

            // Synchronized block → object-level lock acquired
            // Only one thread can execute this block at a time
            // Other thread waits until lock is released


            for (int i = 0; i < 10; i++) {

                System.out.print(" Good morning ");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }

                System.out.println(name);
            }


        }


        // 10 lakh lines of code → runs concurrently in both threads after the lock
        ;
        ;
        ;
        ;
        ;
        ;
        ;  // 1 lakh line of code
    }


}

class myThread1 extends Thread {

    DisplayD d;
    String name;

    myThread1(DisplayD d, String name) {

        this.d = d;
        this.name = name;
    }

    public void run() {

        d.wish(name);
    }


}

public class synchronizationBlockDemo {

    public static void main(String[] args) {

        DisplayD obj = new DisplayD();
        myThread1 t1 = new myThread1(obj, "Dhoni");
        myThread1 t2 = new myThread1(obj, "Yuvraj");

        t1.start();
        t2.start();


    }
}


//this refers to the current DisplayD object on which wish() is called, and the intrinsic (monitor) lock of that same object is used for synchronization.

// T1 enters synchronized block → acquires the lock.
// T2 tries to enter → waits for the lock.
// T1 exits synchronized block → releases the lock.
// T2 acquires the lock → executes synchronized block.
// Meanwhile, T1 can execute code outside the block concurrently with T2.

// Inside synchronized block → only one thread at a time
//Outside synchronized block → multiple threads can run concurrently