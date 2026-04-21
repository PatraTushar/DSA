class myThread extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println(" child thread ");

            try {
                Thread.sleep(2000);
            }catch (Exception e){}
        }
    }


    public static void main(String[] args) {

        myThread t1=new myThread();

        t1.setDaemon(true);

        t1.start();

        System.out.println(" main thread ");


    }


}





