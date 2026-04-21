class myThread extends Thread {

    static int total = 0;


    @Override
    public void run() {


        synchronized (this) {

            System.out.println(" child thread acquire the lock and want to perform some activity ");


            for (int i = 0; i < 100; i++) {
                total += i;
            }


            System.out.println(" child thread wants to give notification to the main thread ");
            this.notify();

        }

    }


    public static void main(String[] args) throws Exception {

        myThread obj = new myThread();

        obj.start();


        synchronized (obj) {

            System.out.println(" main thread is acquiring the lock ");

            obj.wait();

            System.out.println(" the updated value is "+ myThread.total);


        }


    }


}





