package MultithreadingAndConcurrency.synchronization;

class DisplayB {

    public static synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {
            System.out.print(" Good Morning : ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println(name);

        }

    }


}

class myThreadB extends Thread {

    DisplayB d;
    String name;

    myThreadB(DisplayB d, String name) {

        this.d = d;
        this.name = name;

    }

    public void run() {

        d.wish(name);
    }
}
public class synchronizedDemoB {

    public static void main(String[] args) {

        DisplayB d1=new DisplayB();
        DisplayB d2=new DisplayB();

        myThreadB t1=new myThreadB(d1,"Dhoni");
        myThreadB t2=new myThreadB(d2,"Yuvraj");

        t1.start();
        t2.start();


    }
}


// Since there is only one DisplayB class object, the first thread that enters the static synchronized method acquires the class-level lock, and other threads must wait until the lock is released.