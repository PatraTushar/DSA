package MultithreadingAndConcurrency.preventingThreadFromExecution;


// case:1 -> Waiting of Main Thread until Completing Child Thread
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

            obj.join();

           // obj.join(10000);


            for (int i = 0; i < 10; i++) {

                System.out.println(" Main Thread ");
            }


        }
    }
