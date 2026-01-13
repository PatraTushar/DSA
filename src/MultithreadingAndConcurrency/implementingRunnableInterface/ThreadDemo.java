package MultithreadingAndConcurrency.implementingRunnableInterface;


class myRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" Child Method");
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        myRunnable obj = new myRunnable();
        Thread t1 = new Thread(obj);        // (obj) ->Target Runnable
        // Thread t2 = new Thread();
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(" Main Thread ");
        }


    }
}


// for loop inside main() is executed by main Thread
// run() method is executed by child thread
// if I don't pass obj in the bracket of object creation  Thread t1 = new Thread();  then  “Thread class run method is called internally”
// if I  pass obj in the bracket of object creation  Thread t1 = new Thread(obj);  then  myRunnable  class run method is called  where myRunnable is a userDefined class
