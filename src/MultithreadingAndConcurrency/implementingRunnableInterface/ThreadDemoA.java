package MultithreadingAndConcurrency.implementingRunnableInterface;


// case study : Thread creation with or without Runnable

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
//        t1.run();
//
//        Thread t2 = new Thread(obj);
//        t2.start();
//        t2.run();
//
//        obj.run();
        // obj.start();


    }
}
