package MultithreadingAndConcurrency.multiThreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

class Display {

    ReentrantLock l=new ReentrantLock();

    public void wish(String name) {

        l.lock();   // Line1

        for (int i = 0; i < 10; i++) {

            System.out.print(" Good Morning : ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println(name);

        }

        l.unlock();  // Line2
    }

}

class myThreadA extends Thread{

    Display d;
    String name;

    myThreadA(Display d, String name){

        this.d=d;
        this.name=name;

    }

    @Override
    public void run() {

        d.wish(name);
    }
}

public class ReentrantLockDemoA {

    public static void main(String[] args) {


        Display d=new Display();
        myThreadA t1=new myThreadA(d,"Dhoni");
        myThreadA t2=new myThreadA(d,"Yuvraj");
        myThreadA t3=new myThreadA(d,"Kohli");

        t1.start();
        t2.start();
        t3.start();


    }
}


// if we comment Line1 and Line2 then the threads will be executed concurrently and we will get irregular output .
// If we are not commenting Line1 and Line2 then the threads will be executed one by one and we will get regular output