package MultithreadingAndConcurrency.preventingThreadFromExecution;

class myThread1 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(" child thread " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class sleepMethodDemo {

    public static void main(String[] args) {

        myThread1 t = new myThread1();
        t.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println(" main thread "+i);

            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
