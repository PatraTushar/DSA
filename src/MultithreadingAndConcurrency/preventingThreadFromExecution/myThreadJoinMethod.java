package MultithreadingAndConcurrency.preventingThreadFromExecution;


// case:1 -> Waiting of Main Thread until Completing Child Thread
// If we comment Line 1 then both main thread ad child thread will be executed concurrently and we can't expect exact output
// If we are not commenting Line 1 then main thread calls join() method on child thread object hence main thread will wait until completing child thread.In this case output is child thread  10 times followed by main thread 10 times
class myThreadA extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" Child Thread ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}

            }


        }

    }

    public class myThreadJoinMethod {

        public static void main(String[] args) throws InterruptedException {

            myThreadA obj = new myThreadA();

            obj.start();

            // Main Thread waits until child Thread Completes Execution

            obj.join();  // Line 1

           // obj.join(10000);


            for (int i = 0; i < 10; i++) {

                System.out.println(" Main Thread ");
            }


        }
    }
