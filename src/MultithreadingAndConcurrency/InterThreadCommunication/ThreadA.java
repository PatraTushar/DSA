package MultithreadingAndConcurrency.InterThreadCommunication;

class ThreadB extends Thread {

    int total = 0;

    @Override
    public void run() {

        synchronized (this) {

            System.out.println(" child thread starts calculation ");    // 2nd execution

            for (int i = 1; i <= 100; i++) {

                total+=i;
            }

            System.out.println(" child thread trying to give notification ");   //  // 3rd execution
            this.notify();

        }
    }
}

public class ThreadA {


    public static void main(String[] args) throws InterruptedException {

        ThreadB obj = new ThreadB();
        obj.start();

     //   Thread.sleep(10000);

        synchronized (obj) {

            System.out.println(" main thread trying to call wait() method ");    // 1st execution
            obj.wait();

            System.out.println(" main thread get notification ");    // 4th execution
            System.out.println(obj.total);      // 5th execution


        }



    }
}
