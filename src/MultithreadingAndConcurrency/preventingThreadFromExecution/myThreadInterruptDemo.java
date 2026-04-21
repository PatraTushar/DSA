package MultithreadingAndConcurrency.preventingThreadFromExecution;

class myThreadD extends Thread {

    public void run() {

        // Step 6: Child thread starts execution of run()

        try {
            for (int i = 0; i < 10; i++) {

                // Step 7: Loop starts (i = 0)

                System.out.println(" I am lazy thread");
                // Step 8: Child prints

                Thread.sleep(2000);
                // Step 9: Child goes to sleep for 2 sec

                // Step 10:
                // If NO interrupt → sleep completes → next iteration
                // If interrupt → exception occurs → jump to catch
            }

            // Step 11: Loop completes normally (only if no interrupt)

        } catch (InterruptedException e) {

            // Step 11: Interrupt occurs → control comes here

            System.out.println(" I got interrupted");

            // Step 12: run() ends after catch
        }

        // Step 13: run() method ends
    }
}

public class myThreadInterruptDemo {

    public static void main(String[] args) {

        // Step 1: main() starts

        myThreadD obj = new myThreadD();
        // Step 2: Thread object created (NEW state)

        obj.start();
        // Step 3: Thread becomes RUNNABLE → run() will execute

        obj.interrupt();
        // Step 4: Interrupt signal sent (flag = true)

        System.out.println(" End of main Thread ");
        // Step 5: Main thread prints and ends
    }
}
// if we comment Line 1 then main thread won't interrupt child thread op is "End of main Thread" followed by 10 times "I am lazy thread"
// if we won't comment Line 1 then main thread  interrupt child thread op is "End of main Thread"  "I am lazy thread"  "I got interrupted"
