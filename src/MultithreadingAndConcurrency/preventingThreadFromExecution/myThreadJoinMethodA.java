package MultithreadingAndConcurrency.preventingThreadFromExecution;


// case 2:-> Waiting Of Child Thread Until Completing Main Thread
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
