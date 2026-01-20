package MultithreadingAndConcurrency.InterThreadCommunication;

// “It is the case where the main thread’s synchronized block runs first.”
class ThreadB extends Thread {

    int total = 0;

    @Override
    public void run() {

        // STEP 6:
        // Child thread enters run()
        // It tries to acquire lock of "this" (this == obj)

        synchronized (this) {

            // STEP 7:
            // Child thread successfully acquires obj's lock
            // Main thread is either WAITING or BLOCKED


            System.out.println(" child thread starts calculation ");    // 2nd execution

            // STEP 8:
            // Child thread starts calculation while holding the lock

            for (int i = 1; i <= 100; i++) {

                total+=i;
            }

            // STEP 9:
            // total = 5050
            // Lock is STILL held by child thread

            System.out.println(" child thread trying to give notification ");   //  // 3rd execution

            // STEP 10:
            // Child thread calls notify()
            // Main thread moves from WAITING -> BLOCKED
            // Lock is NOT released here
            this.notify();

        }

        // STEP 11:
        // Child thread exits synchronized block
        // Lock of obj is released
        // Child thread finishes execution
    }
}

public class ThreadA {


    public static void main(String[] args) throws InterruptedException {

        // STEP 1:
        // Main thread starts execution

        ThreadB obj = new ThreadB();

        // STEP 2:
        // obj created in heap
        // obj has its own monitor lock

        obj.start();

        // STEP 3:
        // Child thread is created and moved to RUNNABLE state
        // JVM decides when it will execute

     //   Thread.sleep(10000);

        synchronized (obj) {


            // STEP 4:
            // Main thread acquires lock of obj


            System.out.println(" main thread trying to call wait() method ");    // 1st execution

            // STEP 5:
            // Main thread is about to call wait()

            obj.wait();

            // STEP 6:
            // Main thread releases obj's lock
            // Main thread enters WAITING state
            // Main thread waits for notification

            System.out.println(" main thread get notification ");    // 4th execution

            // STEP 12:
            // Main thread re-acquires obj's lock
            // Resumes execution after wait()
            System.out.println(obj.total);      // 5th execution

            // STEP 13:
            // Main thread prints final result: 5050


        }

        // STEP 14:
        // Main thread exits synchronized block
        // Lock is released
        // Program ends


    }
}


//Every object in Java has a default lock (also called an intrinsic lock or monitor lock)

// If there is one object, only one thread can hold its lock at a time. Other threads cannot enter a synchronized block on that object until the lock is released.

// A thread is in BLOCKED state when it wants to enter a synchronized block/method but cannot because another thread already holds the object’s lock.