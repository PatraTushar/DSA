package MultithreadingAndConcurrency.preventingThreadFromExecution;

class myThreadD extends Thread {

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {

                System.out.println(" I am lazy thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e) {

            System.out.println(" I got interrupted");


        }

    }

}

public class myThreadInterruptDemo {

    public static void main(String[] args) {

        myThreadD obj=new myThreadD();
        obj.start();
        obj.interrupt();

        System.out.println(" End of main");

    }
}
