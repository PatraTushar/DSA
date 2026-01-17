package MultithreadingAndConcurrency.synchronization;

import com.sun.jdi.request.StepRequest;

class Display {

    public synchronized void wish(String name) {

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

class myThread extends Thread {

    Display d;
    String name;

    myThread(Display d, String name) {

        this.d = d;
        this.name = name;

    }

    public void run() {

        d.wish(name);
    }
}


public class synchronizedDemo {

    public static void main(String[] args) {

        Display d = new Display();
        myThread t1 = new myThread(d, "Dhoni");
        myThread t2 = new myThread(d, "Yuvraj");
        myThread t3 = new myThread(d, "Kohli");
        myThread t4 = new myThread(d, "Raina");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}


// If we are not declaring wish() method as synchronized then both threads will be executed concurrently and hence we will get irregular output
// if we are declaring wish() method as synchronized then at a time only one thread is allowed to execute the wish() method on the given display object hence we will get regular output
