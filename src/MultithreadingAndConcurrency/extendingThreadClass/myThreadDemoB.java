package MultithreadingAndConcurrency.extendingThreadClass;

// Not overriding run() method
class myThreadB extends Thread{


}
public class myThreadDemoB {

    public static void main(String[] args) {

        myThreadB obj=new myThreadB();
        obj.start();

    }
}


// “If you are not overriding run(), JVM will call Thread class run() method which has no implementation”