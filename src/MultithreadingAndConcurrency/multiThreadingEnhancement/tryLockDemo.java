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

            // Step 7: Thread tries to acquire the lock without waiting.
            // Case A: If the lock is free, the thread acquires it and enters the critical section.
            // Case B: If the lock is already held by another thread, tryLock() returns false immediately.


            System.out.println(Thread.currentThread().getName() + " Got lock and performing some operations ");
            // Step 8: Prints that it got the lock.

            try {
                Thread.sleep(2000);
                // Step 9: Simulate some operation inside critical section.
                // During this sleep, other thread cannot acquire the lock.

            } catch (InterruptedException e) {
            }
            l.unlock();
            // Step 10: Release the lock after completing critical section.
            // Now other threads can acquire the lock if they attempt.
        } else {

            System.out.println(Thread.currentThread().getName() + " unable to get lock and hence performing alternative operations" +
                    "");
            //  If thread failed to acquire lock, it immediately executes alternative operations.

        }
    }
}

public class tryLockDemo {

    // Step 1: Main thread starts execution of main() method
    // Main thread is the one running the program initially.
    public static void main(String[] args) {

        myThreadB t1 = new myThreadB(" First Thread ");
        // Step 2: Object t1 is created.
        // The constructor calls Thread(name), so t1 now has name "First Thread".


        myThreadB t2 = new myThreadB(" Second Thread ");
        // Step 3: Object t2 is created with name "Second Thread".

        t1.start();
        // Step 4: The main thread calls start() on t1.
        // JVM creates a new thread (Thread-0 or as named "First Thread") which will execute t1.run() asynchronously.

        t2.start();
        // Step 5: The main thread calls start() on t2.
        // JVM creates another new thread (Thread-1 or as named "Second Thread") which will execute t2.run() asynchronously.

        // Step 6: Both t1 and t2 now run concurrently, race to acquire the static ReentrantLock 'l'.

    }


    }



// “There is only one ReentrantLock for the whole class, shared by all instances.”
//All objects (t1, t2, …) refer to the same lock.
//This ensures that when one thread acquires the lock, other threads have to wait or fail (tryLock()) — proper synchronization.
//If l were not static, each thread would have its own lock, and they could all enter the critical section simultaneously, which defeats the purpose of using a lock.
//In short: Static lock = shared among all objects of the class.

// Non-static lock → each object has its own lock