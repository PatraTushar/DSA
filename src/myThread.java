public class myThread extends Thread {

    static Thread mt;

    @Override
    public void run() {


        for (int i = 0; i < 10; i++) {

            try {
                mt.join();
            } catch (Exception e) {
            }

            System.out.println(" child thread ");

        }
    }

    public static void main(String[] args) throws Exception {

        mt = Thread.currentThread();

        myThread t = new myThread();
        t.start();


        for (int i = 0; i < 10; i++) {

            System.out.println(" main thread ");
        }


    }

}



// mt.join()->“Child thread will WAIT until mt (main thread) finishes execution”



