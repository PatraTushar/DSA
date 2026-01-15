package MultithreadingAndConcurrency.preventingThreadFromExecution;

// sleep() method
public class SlideRotator {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 10; i++) {

            System.out.println(" slide-" +i);
            Thread.sleep(5000);
        }


    }
}
