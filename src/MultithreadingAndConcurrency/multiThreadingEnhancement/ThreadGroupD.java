package MultithreadingAndConcurrency.multiThreadingEnhancement;


// write a program to display all active thread names belongs to System Group and its Child Group
public class ThreadGroupD {

    public static void main(String[] args) {

        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();

        Thread[] t = new Thread[system.activeCount()];

        system.enumerate(t);

        for (Thread t1 : t) {

            System.out.println(t1.getName() +"----"+t1.isDaemon());
        }
    }
}
