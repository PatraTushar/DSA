package MultithreadingAndConcurrency.synchronization;


class DisplayD {

    public void wish(String name) {


        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ; // 1 lakhs line of code

        synchronized (this) {

            for (int i = 0; i < 10; i++) {

                System.out.print(" Good morning ");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }

                System.out.println(name);
            }


        }


        ;
        ;
        ;
        ;
        ;
        ;
        ;  // 1 lakh line of code
    }


}

class myThreadD extends Thread {

    DisplayD d;
    String name;

    myThreadD(DisplayD d, String name) {

        this.d = d;
        this.name = name;
    }

    public void run() {

        d.wish(name);
    }


}

public class synchronizationBlockDemo {

    public static void main(String[] args) {

        DisplayD obj = new DisplayD();
        myThreadD t1 = new myThreadD(obj, "Dhoni");
        myThreadD t2 = new myThreadD(obj, "Yuvraj");

        t1.start();
        t2.start();


    }
}
