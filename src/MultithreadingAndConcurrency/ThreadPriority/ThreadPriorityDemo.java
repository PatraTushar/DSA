package MultithreadingAndConcurrency.ThreadPriority;


class myThreadA extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" Child Thread");
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        myThreadA obj = new myThreadA();

        obj.setPriority(8);

        obj.start();

        for (int i = 0; i < 10; i++) {

            System.out.println(" Main Thread ");
        }


    }
}



// The output we expected was 10 times child thread followed by 10 times main thread as we have set the priority of myThreadA obj to 8 which is greater than default priority i.e. 5 bt we are not getting the output because some platforms won't provide proper support for thread priorities
// There is no problem in our code the problem is on underlying os

