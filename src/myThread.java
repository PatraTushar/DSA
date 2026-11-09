public class myRunnable implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println(" child thread ");
        }
    }


    public static void main(String[] args) {


        myRunnable r = new myRunnable();
        Thread t1 = new Thread(r);

        t1.start();


        for (int i = 0; i < 5; i++) {

            System.out.println(" main thread ");
        }


    }
}


