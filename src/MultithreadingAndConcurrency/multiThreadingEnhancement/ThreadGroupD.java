package MultithreadingAndConcurrency.multiThreadingEnhancement;


// write a program to display all active thread names belongs to System Group and its Child Group
public class ThreadGroupD {

    public static void main(String[] args) {

        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();

        Thread[] t = new Thread[system.activeCount()];   // system.activeCount()->It returns an estimate of the number of active threads in the ThreadGroup (system) and its child ThreadGroups.

        system.enumerate(t);     // It copies all active threads from the ThreadGroup (system) into your array t.

        for (Thread t1 : t) {

            System.out.println(t1.getName() +"----"+t1.isDaemon());
        }
    }
}
