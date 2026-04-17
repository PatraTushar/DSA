public class myThread extends Thread {

    static Thread mt;

    @Override
    public void run() {

        // STEP 5: Child thread starts executing run()

        for (int i = 0; i < 10; i++) {

            try {

                // STEP 6: Child thread calls join() on mt (main thread)
                // Meaning: "I will WAIT until main thread completes execution"

                mt.join();

                // STEP 7: Because mt = main thread,
                // child thread enters WAITING state here
                // it will NOT proceed until main thread finishes completely

            } catch (Exception e) {
            }

            // STEP 10: This line executes ONLY AFTER main thread finishes
            System.out.println(" child thread ");
        }
    }

    public static void main(String[] args) throws Exception {

        // STEP 1: JVM starts MAIN thread

        mt = Thread.currentThread();

        // STEP 2: mt now holds reference of MAIN THREAD

        myThread t = new myThread();
        t.start();

        // STEP 3: Child thread is created and starts run() concurrently

        for (int i = 0; i < 10; i++) {

            // STEP 4: Main thread is executing this loop
            System.out.println(" main thread ");
        }

        // STEP 8: After loop, MAIN THREAD completes execution

        // STEP 9: Now mt.join() condition is satisfied
        // so child thread gets notification that main is finished
    }
}