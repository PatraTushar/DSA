package MultithreadingAndConcurrency.multiThreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

class Display {

    ReentrantLock l=new ReentrantLock();

    public void wish(String name) {

        l.lock();   // Line1
        // Step:7 Thread acquires the lock
        // If another thread is already inside wish(), this thread waits until the lock is free

       // Only the thread holding the lock can enter the loop at a time

        for (int i = 0; i < 10; i++) {

            // Step 8: Thread prints "Good Morning :"
            System.out.print(" Good Morning : ");

            try {
                // Step 9: Thread sleeps for 2 seconds
                // During sleep, other threads are blocked at l.lock()
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            // Step 10: Thread prints its name in order
            System.out.println(name);

        }

        l.unlock();  // Line2
        // Step 11: Thread releases the lock
        // Next waiting thread (if any) acquires the lock and enters wish()
    }

}

class myThreadA extends Thread{

    Display d;
    String name;

    myThreadA(Display d, String name){

        // Step 3: Same Display object is shared by all threads
        this.d=d;
        this.name=name;

    }

    @Override
    public void run() {

        // Step 4: Each thread enters this method after start()
        d.wish(name);
    }
}

public class ReentrantLockDemoA {

    public static void main(String[] args) {


        // Step 1: Main thread starts execution

        Display d=new Display();
        // Step 2: One Display object is created


        myThreadA t1=new myThreadA(d,"Dhoni");
        myThreadA t2=new myThreadA(d,"Yuvraj");
        myThreadA t3=new myThreadA(d,"Kohli");
        // Step 3: Three threads are created sharing the same Display object

        t1.start();
        // Step 4: Thread-1 starts and enters wish("Dhoni")


        t2.start();
        // Step 5: Thread-2 starts and enters wish("Yuvraj") without waiting


        t3.start();
        // Step 6: Thread-3 starts and enters wish("Kohli") without waiting



    }
}


// if we comment Line1 and Line2 then the threads will be executed concurrently and we will get irregular output .
// If we are not commenting Line1 and Line2 then the threads will be executed one by one and we will get regular output