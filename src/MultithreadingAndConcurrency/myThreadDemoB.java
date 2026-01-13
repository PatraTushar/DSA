package MultithreadingAndConcurrency;

// Not overriding run() method
class myThreadB extends Thread{


}
public class myThreadDemoB {

    public static void main(String[] args) {

        myThreadB obj=new myThreadB();
        obj.start();

    }
}
