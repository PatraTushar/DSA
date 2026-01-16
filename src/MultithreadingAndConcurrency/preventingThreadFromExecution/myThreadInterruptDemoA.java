package MultithreadingAndConcurrency.preventingThreadFromExecution;


class myThreadE extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10000; i++) {

            System.out.println(" I am lazy Thread "+i);
        }

        System.out.println(" I want to sleep ");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

            System.out.println(" I got interrupted ");
        }
    }
}

public class myThreadInterruptDemoA {

    public static void main(String[] args) {

        myThreadE obj=new myThreadE();
        obj.start();
       obj.interrupt();

        System.out.println(" End of main thread  ");

    }
}


// whenever we are calling interrupt() method if the target thread is not in sleeping state or waiting state  then there is no impact of interrupt call immediately.
// Interrupt call will be waited until target thread entered into sleeping or waiting state.If the target thread entered into sleeping or waiting state then immediately interrupt call will interrupt the target thread.

// special case
// If the target thread never entered into sleeping or waiting state in its lifetime then there is no impact of interrupt call.This is the only case where interrupt call will be wasted


//  In the above example interrupt call waited until the thread completes for loop 10000 times


