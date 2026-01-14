package MultithreadingAndConcurrency.ThreadPriority;


class myThread extends Thread{}
public class ThreadDemo {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());   // 5 (Default)

        Thread.currentThread().setPriority(7);

        System.out.println(Thread.currentThread().getPriority()); // 7

        myThread obj=new myThread();

        System.out.println(obj.getPriority()); // 7



    }
}
