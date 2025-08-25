package OopsByKK.Multithreding;


// 1 : Extending The Thread Class
class MyThread extends Thread {

    public void run() {

        System.out.println(" Thread Running : " + Thread.currentThread().getName());


    }
}


// 2 : Implementing The Runnable Interface
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}

public class ThreadCreation {

    public static void main(String[] args) {

        MyThread obj = new MyThread();  // NEW state
        obj.start();    // RUNNABLE -> RUNNING

        // Execution Flow:
        // 1: new MyThread() → Thread object created in heap memory, state = NEW.
        // 2:t1.start() → JVM asks Thread Scheduler to pick this thread → state = RUNNABLE.
        // 3:When CPU gives time → JVM creates a separate stack for this thread → state = RUNNING.
        // 4:run() method instructions are pushed into that stack.


        //  t1.run(); // ❌ This will NOT start a new thread
        // This just calls the method in the current thread (main thread).
        // No new stack is created, no multithreading happens.


        MyRunnable task = new MyRunnable();
        Thread t1 = new Thread(task);
        t1.start();

        // Why Runnable?
        //Java supports only single inheritance → you can’t extend Thread if your class already extends another class.
        //Runnable is more flexible.
        //Internally, when you pass Runnable to Thread, the Thread’s run() calls Runnable’s run().


        // 3: Using Lambda (Shortcut for Runnable)

        Thread t = new Thread(() -> {
            System.out.println("Lambda thread: " + Thread.currentThread().getName());
        });
        t.start();

        // Runnable is a functional interface (@FunctionalInterface).
        //So we can use a lambda to define run().


    }
}
