package MultithreadingAndConcurrency.multiThreadingEnhancement;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {

    String name;

    PrintJob(String name) {

        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name + " job started by thread : " + Thread.currentThread().getName());

        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println(name + " job complete by thread : " + Thread.currentThread().getName());


    }

}

public class ExecutorDemo {

    public static void main(String[] args) {

        PrintJob[] jobs = {new PrintJob("Durga"),
                new PrintJob("Ravi"),
                new PrintJob("Shiva"),
                new PrintJob("Pavan"),
                new PrintJob("Suresh"),
                new PrintJob("Anil")};


        ExecutorService service = Executors.newFixedThreadPool(3);

        for (PrintJob job : jobs) {

            service.submit(job);
        }

        service.shutdown();


    }
}


// Note : There is only ONE thread pool object (service), and how many threads exist inside that pool is decided by the number we pass in the bracket.

// ExecutorService
//It’s an interface in Java (java.util.concurrent).
//Provides methods to submit and manage tasks, like submit(), shutdown(), etc.
//Example: ExecutorService service = Executors.newFixedThreadPool(3);

//Thread Pool
//It’s a concept / implementation of ExecutorService.
//It’s a pool of threads that executes submitted tasks.



// flow of the program

// Step 1: submit(job) is called
//service.submit(job);
//The job is a Runnable object (PrintJob in your case).
//submit() does not create a new thread immediately.
//Instead, it adds the job to an internal queue inside the ExecutorService.
//Think of it like putting a ticket in a waiting line for the chefs (threads) in our fast-food analogy.


//Step 2: Thread pool checks for a free thread
//The ExecutorService has 3 threads in the pool (Thread-1, Thread-2, Thread-3).
//When a job is submitted, the pool looks for a free thread:
//If a thread is free → it assigns the job to that thread immediately.
//If all threads are busy → the job waits in the queue until a thread becomes free.


//Step 3: Job execution
//When a thread picks up the job, it calls the run() method of the Runnable.
//System.out.println(name + " job started by thread : " + Thread.currentThread().getName());
//Thread.sleep(5000); // simulate work
//System.out.println(name + " job complete by thread : " + Thread.currentThread().getName());
//The thread executes the job concurrently with other threads in the pool.
//After finishing, the thread checks the queue:
//If there’s another job waiting → picks it up immediately.
//If no jobs → stays idle until a new job is submitted (or until shutdown() is called).


//Step 4: Thread reuse
//Threads are reused for multiple jobs.
//This is why a fixed thread pool is efficient: we don’t create a new thread for every job.
//Example flow with your 6 jobs and 3 threads:
//Job Submitted	Thread Assigned	Status
//Durga	Thread-1	Running
//Ravi	Thread-2	Running
//Shiva	Thread-3	Running
//Pavan	Waiting in queue	Pending
//Suresh	Waiting in queue	Pending
//Anil	Waiting in queue	Pending
//After Thread-1 finishes Durga, it picks Pavan.
//After Thread-2 finishes Ravi, it picks Suresh.
//After Thread-3 finishes Shiva, it picks Anil.



// note
// Each thread picks a job and starts running it immediately,
// but the actual printing order is not guaranteed.
// For example, Durga may be picked first, but Ravi or Shiva may print first
// because threads execute concurrently and the JVM scheduler decides which runs first.



// “How many threads there are, that many jobs acquire a thread at a time.”

// The output is irregular. ✅
//Even though jobs are submitted in order, threads run concurrently, so the start and completion prints may not follow the submission order.

//Jobs are submitted sequentially to the thread pool, but once threads start executing (up to the pool size), the output becomes irregular

// shutdown() tells the ExecutorService: “Stop accepting new jobs, but finish all the jobs that are already submitted.”