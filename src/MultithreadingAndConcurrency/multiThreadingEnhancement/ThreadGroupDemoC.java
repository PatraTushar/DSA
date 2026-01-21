package MultithreadingAndConcurrency.multiThreadingEnhancement;

class myThread extends Thread {

    myThread(ThreadGroup g, String name) {
        super(g, name);
    }

    @Override
    public void run() {

        System.out.println(" Child Thread ");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}

public class ThreadGroupDemoC {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup parent = new ThreadGroup("parent Group");
        ThreadGroup child = new ThreadGroup(parent,"Child Group");

        myThread t1 = new myThread(parent, "ChildThread1");
        myThread t2 = new myThread(parent,"childThread2");
        t1.start();
        t2.start();

        System.out.println(parent.activeCount());  // 2
        System.out.println(parent.activeGroupCount());  // 1
        parent.list();


        Thread.sleep(10000);


        System.out.println(parent.activeCount());  // 0
        System.out.println(parent.activeGroupCount());  // 1
        parent.list();












    }
}
