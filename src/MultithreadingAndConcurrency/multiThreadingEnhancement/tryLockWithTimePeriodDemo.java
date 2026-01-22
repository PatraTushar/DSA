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

            // Step 7: The thread enters a loop, attempting to acquire the lock repeatedly until successful.


            try {

                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    // Step 8: Thread tries to acquire the lock for a maximum of 5000ms (5 seconds).
                    // Case A: Lock is free → thread acquires the lock immediately.
                    // Case B: Lock is held → thread waits up to 5 seconds to acquire it.
                    // Case C: After 5 seconds, if lock is still unavailable, tryLock returns false.

                    System.out.println(Thread.currentThread().getName() + " got the lock ");
                    // Step 9: Thread acquired the lock → enters critical section.

                    Thread.sleep(30000);
                    // Step 10: Simulates some operation inside critical section.
                    // While this thread holds the lock, the other thread cannot acquire it.

                    l.unlock();
                    // Step 11: Releases the lock after finishing critical section.

                    System.out.println(Thread.currentThread().getName() + " releases the lock ");
                    // Step 12: Prints that the lock is released.

                    break;
                    // Step 13: Exit the loop since work is done.
                } else {

                    // Step 14: If tryLock fails (lock not acquired within 5 seconds):
                    System.out.println(Thread.currentThread().getName() + " unable to get the lock and will try again ");
                    // Step 15: Thread will retry acquiring the lock in the next iteration of the loop.
                }

            } catch (InterruptedException e) {
                // Step 16: Handles InterruptedException from tryLock or sleep.
            }


        } while (true);
        // Step 17: Loop continues until the thread successfully acquires the lock and finishes.
    }
}

public class tryLockWithTimePeriodDemo {

    // Step 1: Main thread starts executing main() method.
    // This is the thread that JVM uses to start the program.

    public static void main(String[] args) {

        myThreadC t1=new myThreadC(" First Thread ");
        // Step 2: Object t1 is created.
        // Constructor calls Thread(name), so t1 now has the name "First Thread".

        myThreadC t2=new myThreadC(" Second Thread ");
        // Step 3: Object t2 is created.
        // Constructor calls Thread(name), so t2 now has the name "Second Thread".

        t1.start();
        // Step 4: Main thread calls start() on t1.
        // JVM creates a new thread for t1 and schedules t1.run() for execution asynchronously.


        t2.start();
        // Step 5: Main thread calls start() on t2.
        // JVM creates another thread for t2 and schedules t2.run() for execution asynchronously.

        // Step 6: Both t1 and t2 now run concurrently.
        // They race to acquire the static ReentrantLock 'l'.

    }
}
