package MultithreadingAndConcurrency.preventingThreadFromExecution;

// case: 3-> If main thread calls join() method on child thread object and child thread calls join() method on main thread object then both thread will be wait forever and the program will be stucked/paused.This is something like Deadlock
class myThreadC extends Thread {

    static Thread mt;

    @Override
    public void run() {

        try {

            mt.join();
        } catch (InterruptedException e) {
        }


        for (int i = 0; i < 10; i++) {

            System.out.println(" Child Thread ");
        }
    }
}

public class MyThreadJoinMethodB {

    public static void main(String[] args) throws InterruptedException {

        myThreadC.mt = Thread.currentThread();   // main thread object

        myThreadC obj = new myThreadC();     // child thread object

        obj.start();

        obj.join();

        for (int i = 0; i < 10; i++) {

            System.out.println(" Main Thread ");
            Thread.sleep(2000);
        }


    }
}
