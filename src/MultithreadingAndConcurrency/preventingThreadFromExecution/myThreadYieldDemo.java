package MultithreadingAndConcurrency.preventingThreadFromExecution;


class myThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" Child Thread ");
            Thread.yield();
        }
    }
}

public class myThreadYieldDemo {

    public static void main(String[] args) {

        myThread obj = new myThread();

        // Child thread gets lower priority
        obj.setPriority(Thread.MIN_PRIORITY);

        // Main thread gets higher priority
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        obj.start();


        for (int i = 0; i < 10; i++) {

            System.out.println(" Main Thread ");
        }

    }
}


//Thread.yield() is a static method that suggests to the thread scheduler that the currently executing thread is willing to
// temporarily pause its execution, allowing other threads of same or higher priority to execute.
// However, this is only a hint, and the scheduler is not guaranteed to honor it, so its behavior is platform and JVM dependent.

//👉 The thread scheduler may accept or ignore Thread.yield().
//
//So:
//
//✔ It can accept it → switch to another thread
//✔ It can ignore it → continue running the same thread
//✔ It is completely JVM + OS dependent