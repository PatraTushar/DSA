package java_Jspider;

public class myThread {


    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread() {

            @Override
            public void run() {

                try {

                    for (int i = 0; i < 10; i++) {

                        System.out.println("child thread");
                        Thread.sleep(3000);

                    }

                } catch (Exception e) {
                }

            }
        };
        t1.start();

        for (int i = 0; i < 10; i++) {

            System.out.println(" main thread ");
            Thread.sleep(2000);
        }


    }


}









