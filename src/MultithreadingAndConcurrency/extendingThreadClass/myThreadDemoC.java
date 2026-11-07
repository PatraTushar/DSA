package MultithreadingAndConcurrency.extendingThreadClass;


// overriding the start() method
class myThreadC extends Thread {

    public void start() {

        System.out.println(" Start Method ");

    }



    @Override
    public void run() {

        System.out.println(" Run Method ");

    }
}

public class myThreadDemoC {

    public static void main(String[] args) {

        myThreadC obj = new myThreadC();
        obj.start();

        System.out.println(" Main Method ");

    }
}


// obj.start() calls the start() in myThreadC (overridden),
// so the Thread's start() is not called, no new thread is created,
// and the run() method is never executed.
// There is only one thread i.e. the main thread.


//"When we override the start() method of the Thread class and call obj.start(),
// the overridden start() method gets executed instead of the original start() method.
// Since the original start() method is not called, no new thread is created.
// Therefore, only the main thread exists, and the run() method is not automatically executed."

