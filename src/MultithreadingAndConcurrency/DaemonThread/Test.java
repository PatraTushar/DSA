package MultithreadingAndConcurrency.DaemonThread;


class myThread extends Thread{}
public class Test {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().isDaemon());  // false

     //    Thread.currentThread().setDaemon(true);      Runtime exception : IllegalThreadStateException

        myThread t=new myThread();

        System.out.println(t.isDaemon()); // false    In Java, every newly created thread is a user (non-daemon) thread by default. It becomes a daemon thread only if explicitly set using setDaemon(true) before starting.

        t.setDaemon(true);

        System.out.println(t.isDaemon()); // true
    }
}
