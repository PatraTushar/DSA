
class myThread extends Thread {

    static Thread mt;

    @Override
    public void run() {


        try {

            mt.join();

        } catch (InterruptedException e) {
        }

        for (int i = 0; i < 10; i++) {

            System.out.println(" child thread ");

        }
    }
}

public class myPractice {


    public static void main(String[] args) throws InterruptedException {

        myThread.mt=Thread.currentThread();


        myThread obj = new myThread();
        obj.start();




        for (int i = 0; i < 10; i++) {

            System.out.println(" main thread ");
            Thread.sleep(2000);
        }


    }

}

