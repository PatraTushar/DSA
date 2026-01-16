package MultithreadingAndConcurrency.preventingThreadFromExecution;

class myThreadD extends Thread {

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {

                System.out.println(" I am lazy thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e) {

            System.out.println(" I got interrupted");


        }

    }

}

public class myThreadInterruptDemo {

    public static void main(String[] args) {

        myThreadD obj=new myThreadD();
        obj.start();
       // obj.interrupt();  // Line 1

        System.out.println(" End of main Thread ");

    }
}


// if we comment Line 1 then main thread won't interrupt child thread op is "End of main Thread" followed by 10 times "I am lazy thread"
// if we won't comment Line 1 then main thread  interrupt child thread op is "End of main Thread"  "I am lazy thread"  "I got interrupted"
