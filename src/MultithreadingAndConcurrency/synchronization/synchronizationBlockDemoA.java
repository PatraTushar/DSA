package MultithreadingAndConcurrency.synchronization;


class DisplayE {

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

        synchronized (DisplayE.class) {

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

class myThreadE extends Thread {

    DisplayE d;
    String name;

    myThreadE(DisplayE d, String name) {

        this.d = d;
        this.name = name;
    }

    public void run() {

        d.wish(name);
    }


}

public class synchronizationBlockDemoA {

    public static void main(String[] args) {

        DisplayE d1 = new DisplayE();
        DisplayE d2 = new DisplayE();

        myThreadE t1=new myThreadE(d1,"Dhoni");
        myThreadE t2=new myThreadE(d2,"Yuvraj");

        t1.start();
        t2.start();

    }
}


// If Thread-1 is inside synchronized(Display.class) block:
//Other threads cannot enter any synchronized(Display.class) block (any instance) until the lock is released.
//Other threads CAN enter synchronized methods on the same object if those methods do not use the class lock.
//Example: another method public synchronized void hello() uses instance lock only — a thread can enter that if it gets the instance lock, regardless of class lock.
//Other threads cannot enter this exact block or any other block synchronized on Display.class until the lock is released.