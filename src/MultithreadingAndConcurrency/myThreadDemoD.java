package MultithreadingAndConcurrency;


class myThreadD extends Thread {


    public void start() {

        super.start();
        System.out.println(" Start Method ");

    }

    @Override
    public void run() {

        System.out.println(" Run Method ");

    }
}

public class myThreadDemoD {

    public static void main(String[] args) {

        myThreadD obj = new myThreadD();
        obj.start();

        System.out.println(" Main Method ");


    }
}


// Here, 2 threads exist: main thread and child thread
// Main thread executes main() and the "Start Method" print inside start()
// Child thread executes the run() method ("Run Method" print)

// The run() method is executed only by the child thread


// output
 // 1
//  Start Method
// Main Method
// Run Method


// 2
//  Start Method
// Run Method
// Main Method

// 3
//  Run Method
// Start Method
// Main Method








