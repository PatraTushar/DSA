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

class myThreadD extends Thread {

    DisplayD d;
    String name;

    myThreadD(DisplayD d, String name) {

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
        myThreadD t1 = new myThreadD(obj, "Dhoni");
        myThreadD t2 = new myThreadD(obj, "Yuvraj");

        t1.start();
        t2.start();


    }
}


//this refers to the current DisplayD object on which wish() is called, and the intrinsic (monitor) lock of that same object is used for synchronization.


// t1 enters synchronized block → acquires lock
//t2 tries to enter → blocked
//t1 completes synchronized block → releases lock
//Now t1 is outside the synchronized block → it can run concurrently with t2
//t2 acquires the lock → executes the synchronized block


// Inside synchronized block → only one thread at a time
//Outside synchronized block → multiple threads can run concurrently