public class myThread extends Thread {

    static Thread mt;

    @Override
    public void run() {

        try {
            mt.join();
        } catch (Exception e) {
        }

        for (int i = 0; i < 10; i++) {

            System.out.println(" child thread ");

        }
    }

    public static void main(String[] args) throws Exception {

        myThread.mt=Thread.currentThread();


        myThread t = new myThread();
        t.start();
        t.join();


        for (int i = 0; i < 10; i++) {

            System.out.println(" main thread ");
        }
    }
}



// myThread t = new myThread();
//- At this point, the child thread object is created.
//- But the child thread has not started execution yet.
//- Its state is NEW.


//t.start();
//- At this point, the child thread becomes eligible for execution.
//- JVM thread scheduler decides when it gets CPU time.
//- Its run() method starts executing.


