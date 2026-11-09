public class myThread extends Thread {

    static Thread mt;


    @Override
    public void run() {

        for (int a = 1; a <= 100; a++) {

            System.out.println(" child thread " + a);
        }

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println(" lazy thread " + i);
                Thread.sleep(3000);

            }
        } catch (InterruptedException e) {

            System.out.println(" i got interrupted ");
        }


    }

    public static void main(String[] args) throws Exception {


        myThread t = new myThread();
        t.start();
        t.interrupt();
        System.out.println(" End Of Main ");


    }
}


