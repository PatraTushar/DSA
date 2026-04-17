package MultithreadingAndConcurrency.preventingThreadFromExecution;

class myThreadE extends Thread {

    @Override
    public void run() {

        // STEP 4: Child thread starts executing run()

        // STEP 5: Loop starts (thread is NOT in blocking state)
        // Even if interrupt() was already called, no exception occurs here
        for (int i = 1; i <= 10000; i++) {
            System.out.println("I am lazy Thread " + i);
        }

        // STEP 6: After loop completes
        System.out.println("I want to sleep");

        try {
            // STEP 7: Thread tries to enter sleep (blocking state)

            // IMPORTANT:
            // JVM checks interrupt flag here
            // Since interrupt() was already called earlier,
            // flag is already set → exception thrown immediately

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            // STEP 8: Control comes here immediately
            // because interrupt flag was already set
            System.out.println("I got interrupted");
        }

        // STEP 9: Thread execution ends
    }
}

public class myThreadInterruptDemoA {

    public static void main(String[] args) {

        // STEP 1: Main thread starts

        myThreadE obj = new myThreadE();

        // STEP 2: Child thread is created and scheduled
        obj.start();

        // STEP 3: Main thread immediately calls interrupt()
        // This sets interrupt flag on child thread
        // (No waiting, no exception at this point)
        obj.interrupt();

        // STEP 10: Main thread continues independently
        System.out.println("End of main thread");
    }
}