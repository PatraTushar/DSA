

class myThread extends Thread {

    @Override
    public void run() {

        try {

            System.out.println(" child thread wants to sleep ");
            Thread.sleep(2000);

            System.out.println(" child thread sleeps ");

        } catch (InterruptedException e) {

            System.out.println(" i got interrupted ");
        }

    }
}


public class myPractice {


    public static void main(String[] args) {

        myThread obj = new myThread();
        obj.start();

        obj.interrupt();

        System.out.println(" end of main thread ");


    }

}

