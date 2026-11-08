public class myThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" child thread ");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) throws Exception {

        myThread t = new myThread();
        t.start();

        t.join();

        for (int i = 0; i < 10; i++) {

            System.out.println(" main thread ");
        }
    }
}


