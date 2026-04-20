

class myThread extends Thread {

    static Thread mt;


    @Override
    public void run() {

        try {
            mt.join();
        } catch (Exception e) {
        }


        for (int i = 0; i < 10; i++) {

            System.out.println(" child Thread ");

        }


    }

    public static void main(String[] args) throws Exception {


        myThread.mt = Thread.currentThread();

        myThread t = new myThread();
        t.start();



        for (int i = 0; i < 10; i++) {

            System.out.println(" Main Thread ");
            Thread.sleep(2000);
        }


    }
}










