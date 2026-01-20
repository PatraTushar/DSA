package MultithreadingAndConcurrency.DaemonThread;


class myThread extends Thread{}
public class Test {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().isDaemon());  // false

     //    Thread.currentThread().setDaemon(true);      Runtime exception : IllegalThreadStateException

        myThread t=new myThread();

        System.out.println(t.isDaemon()); // false     because t inherits daemon status from main thread (which is non-daemon)

        t.setDaemon(true);

        System.out.println(t.isDaemon()); // true
    }
}
