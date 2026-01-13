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
