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

// Thread-1 (t1) starts first
//Calls d1.wish("Dhoni")
//Reaches the synchronized(DisplayE.class) block → acquires class-level lock
//Thread-2 (t2) starts
//Calls d2.wish("Yuvraj")
//Reaches the same class-level synchronized block → tries to acquire class-level lock
//Blocked because Thread-1 is holding the lock
//Thread-1 executes the loop inside the synchronized block: prints all 10 "Good morning Dhoni" messages
//Thread-1 exits the synchronized block → releases class-level lock
//Thread-2 acquires the class-level lock → executes the loop: prints 10 "Good morning Yuvraj" messages
