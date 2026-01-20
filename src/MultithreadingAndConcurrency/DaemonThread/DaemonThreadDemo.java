package MultithreadingAndConcurrency.DaemonThread;


class ThreadA extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" child thread ");

            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
    }
}

public class DaemonThreadDemo {

    public static void main(String[] args) {

        ThreadA t=new ThreadA();
        t.setDaemon(true);

        t.start();

        System.out.println(" End of main thread ");


    }
}
