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
        obj.start();


        for (int i = 0; i < 10; i++) {

            System.out.println(" Main Thread ");
        }

    }
}
