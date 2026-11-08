public class myRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println(" child thread ");
        }
    }

    public static void main(String[] args) {

        myRunnable r = new myRunnable();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 5; i++) {

            System.out.println(" main thread ");
        }


    }
}


   // Thread t = new Thread(r);
// Here, the Thread object (child thread) is created, but it has not started execution yet.
// It is in the NEW state.


// "In multithreading, we cannot determine the exact output because the execution order depends on the thread scheduler and JVM."

