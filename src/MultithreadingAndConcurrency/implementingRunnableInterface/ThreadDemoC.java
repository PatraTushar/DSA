package MultithreadingAndConcurrency.implementingRunnableInterface;

class myThreadC extends Thread {

    @Override
    public void run() {

        System.out.println(" Run method executed by thread : " + Thread.currentThread().getName());


    }
}

public class ThreadDemoC {

    public static void main(String[] args) {

        myThreadC obj = new myThreadC();
        obj.start();
        System.out.println(" Main method executed by thread : " + Thread.currentThread().getName());


    }
}
