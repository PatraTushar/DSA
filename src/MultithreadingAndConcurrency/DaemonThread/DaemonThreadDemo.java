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
        t.setDaemon(true);    // Line1

        t.start();

        System.out.println(" End of main thread ");


    }
}


// If the above program if we are commenting Line1 both main thread and child thread are Non-Daemon and both thread will be executed until their completion

// If we are not commenting Line1 then main thread is Non-Daemon and child thread is Daemon .Hence whenever main thread terminates automatically child thread will be terminated.
// In this case op is

// op1
// End of main Thread
// child Thread


// op2
// child Thread
// End of main

// op3
// End of main