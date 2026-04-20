package MultithreadingAndConcurrency.extendingThreadClass;


// overloading the run() method
class myThreadA extends Thread {

    @Override
    public void run() {
        System.out.println(" Child Method ");
    }

    public void run(int a) {

        System.out.println(" int-Argument method ");

    }

}

public class myThreadDemoA {

    public static void main(String[] args) {

        myThreadA obj = new myThreadA();
        obj.start();

        for (int i = 0; i < 10; i++) {

            System.out.println(" main method ");
        }
    }


}


// When we call start(), JVM creates a new thread and internally invokes the run()
// method of that thread. Even if we override run(), only the no-argument run()
// method is executed in the new thread context. If we directly call run(),
// it behaves like a normal method call without creating a new thread.