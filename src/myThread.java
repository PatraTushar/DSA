public class myThread extends Thread {

    static Thread mt;
    @Override
    public void run() {


        try {
            mt.join();
        } catch (Exception e) {
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(" child thread ");

        }
    }

    public static void main(String[] args) throws Exception {

        mt=Thread.currentThread();

        myThread t = new myThread();
        t.start();


        t.join();


        for (int i = 0; i < 10; i++) {

            System.out.println(" main thread ");
        }


    }


}








