package MultithreadingAndConcurrency.preventingThreadFromExecution;


// case 2:-> Waiting Of Child Thread Until Completing Main Thread
// In the example child thread class join() method on main thread object hence child thread has to wait until completing  main thread.In this case output is  main thread 10 times followed by child thread 10 times
class myThreadB extends Thread {

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

public class myThreadJoinMethodA {

    public static void main(String[] args) throws InterruptedException {

        myThreadB.mt = Thread.currentThread();

        myThreadB obj = new myThreadB();

        obj.start();

        for (int i = 0; i < 10; i++) {

            System.out.println(" Main Thread ");
            Thread.sleep(2000);
        }


    }
}
