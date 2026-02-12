package OOPS.Multithreding;
import java.util.concurrent.*;

public class ThreadCreationI {

    public static void main(String[] args) throws Exception{

        // 4: Callable + Future (Return Values from Threads)


        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("Callable running: " + Thread.currentThread().getName());
            return 42; // returning value
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Result: " + future.get()); // blocks until result ready

        executor.shutdown();

        // Runnable → no result, no checked exception.
        //Callable → returns result + can throw checked exception.
        //Future → object representing result of async computation.


       // Choosing Between Them

        // Extend Thread → Simple, but less flexible.
        //Implement Runnable → Preferred in most cases.
        //Use Callable + Future → When you need results.
        //Use ExecutorService → When managing multiple threads efficiently.


    }
}
