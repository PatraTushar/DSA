import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {

    String name;

    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        // Step 8: A worker thread starts executing this job
        System.out.println(name + " job started by thread : "
                + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);  // Step 9: Simulate work (thread is BUSY here)
        } catch (InterruptedException e) {
        }

        // Step 10: Job execution completed
        System.out.println(name + " job completed by thread : "
                + Thread.currentThread().getName());
    }
}

public class ExecutorDemo {

    public static void main(String[] args) {

        // Step 1: Main thread starts here

        // Step 2: Create job objects (only objects, no execution)
        PrintJob[] jobs = {
                new PrintJob("Durga"),
                new PrintJob("Ravi"),
                new PrintJob("Shiva"),
                new PrintJob("Pavan"),
                new PrintJob("Suresh"),
                new PrintJob("Anil")
        };

        // Step 3: Create thread pool with 3 worker threads
        ExecutorService service = Executors.newFixedThreadPool(3);   // “At a time, up to 3 threads can execute tasks.”

        // Internally:
        // 3 worker threads created:
        // pool-1-thread-1
        // pool-1-thread-2
        // pool-1-thread-3
        // (They are idle initially)

        //“Three worker threads pick three jobs, but which thread picks which job is not guaranteed.” ✅

        // Step 4: Submit jobs ONE BY ONE (sequentially by main thread)
        for (PrintJob job : jobs) {

            service.submit(job);

            // Step 5: Each submit() does:
            // → Job is placed into internal queue
            //A worker thread takes a task object from the queue and executes it.”
            // In a thread pool, execute means running the task’s run() method.

            // IMPORTANT:
            // At this moment, threads may start picking jobs immediately
            // In a thread pool, worker threads call the run() method of the task.
        }

        // Step 6: After all submissions
        service.shutdown();
        // → No new tasks allowed
        // → Existing tasks WILL finish

        // =======================
        // ACTUAL THREAD EXECUTION
        // =======================

        // Step 7:
        // First 3 jobs are picked by 3 worker threads (almost immediately)

        // pool-1-thread-1 → picks Durga
        // pool-1-thread-2 → picks Ravi
        // pool-1-thread-3 → picks Shiva

        // Remaining jobs stay in queue:
        // [Pavan, Suresh, Anil]

        // Step 8:
        // Threads execute run() method concurrently

        // Step 9:
        // After ~5 seconds, first batch completes:
        // Durga, Ravi, Shiva finished

        // Step 10:
        // Threads pick next jobs from queue

        // pool-1-thread-1 → picks Pavan
        // pool-1-thread-2 → picks Suresh
        // pool-1-thread-3 → picks Anil

        // Step 11:
        // After another ~5 seconds:
        // Pavan, Suresh, Anil finished

        // Step 12:
        // Queue becomes empty
        // All threads become idle

        // Step 13:
        // Since shutdown() was called:
        // Thread pool TERMINATES completely
    }
}