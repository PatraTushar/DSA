package MultithreadingAndConcurrency.preventingThreadFromExecution;


// case: 4-> If a thread call join() method on the same thread itself then the program will be stucked (This is something like Deadlock)
// In this case Thread has to wait Infinite amount of time
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Thread.currentThread().join();
    }
}
