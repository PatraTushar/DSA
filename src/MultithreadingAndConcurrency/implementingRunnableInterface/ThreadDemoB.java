package MultithreadingAndConcurrency.implementingRunnableInterface;




// Thread Name
class myThreadB extends Thread{}
public class ThreadDemoB {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());  // main

        myThreadB obj=new myThreadB();
        System.out.println(obj.getName());   // Thread-0

        Thread.currentThread().setName(" New Thread ");
        System.out.println(Thread.currentThread().getName());  // New Thread
      //  System.out.println(10/0);



    }
}
