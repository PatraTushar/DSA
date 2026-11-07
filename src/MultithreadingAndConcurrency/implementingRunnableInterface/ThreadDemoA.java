package MultithreadingAndConcurrency.implementingRunnableInterface;


// case study : Thread creation with or without Runnable target

class myRunnableA implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" Child Method");
        }
    }
}

public class ThreadDemoA {

    public static void main(String[] args) {

        myRunnableA obj = new myRunnableA();
        Thread t1 = new Thread();
        t1.start();
      //  t1.run();
//
//        Thread t2 = new Thread(obj);
//        t2.start();
//        t2.run();
//
    //  obj.run();
        // obj.start();


    }
}


// When we create a Thread object without a Runnable target and call start(),
// a new child thread is created, but no task is executed.
// When we pass a Runnable object to the Thread constructor and call start(),
// a new child thread is created, and the Runnable's run() method is executed.
// Calling run() directly executes it like a normal method in the main thread;
// no new child thread is created. Runnable does not have a start() method.