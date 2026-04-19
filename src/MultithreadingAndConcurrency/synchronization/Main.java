package MultithreadingAndConcurrency.synchronization;

class Test {

    synchronized void syncMethod() {
        System.out.println(Thread.currentThread().getName() + " entered syncMethod");

        try {
            Thread.sleep(3000); // hold lock for 3 seconds
        } catch (Exception e) {}

        System.out.println(Thread.currentThread().getName() + " exiting syncMethod");
    }

    void normalMethod() {
        System.out.println(Thread.currentThread().getName() + " inside normalMethod");
    }
}

class MyThread1 extends Thread {
    Test obj;

    MyThread1(Test obj) {
        this.obj = obj;
    }

    public void run() {
        obj.syncMethod();
    }
}

class MyThread2 extends Thread {
    Test obj;

    MyThread2(Test obj) {
        this.obj = obj;
    }

    public void run() {
        obj.syncMethod();
    }
}

class MyThread3 extends Thread {
    Test obj;

    MyThread3(Test obj) {
        this.obj = obj;
    }

    public void run() {
        obj.normalMethod();
    }
}

public class Main {
    public static void main(String[] args) {

        Test obj = new Test(); // SAME OBJECT

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        MyThread3 t3 = new MyThread3(obj);

        t1.start();
        t2.start();
        t3.start();
    }
}



// WHILE A THREAD EXECUTING SYNCHRONIZED METHOD ON THE GIVEN OBJECT THE REMAINING THREADS ARE NOT
// ALLOWED TO EXECUTE  ANY SYNCHRONIZED METHOD CONCURRENTLY ON THE SAME OBJECT BUT THE REMAINING THREADS ARE ALLOWED
// TO EXECUTE NON-SYNCHRONIZED METHOD CONCURRENTLY


//  👉 The output is NOT deterministic
//
//🧠 Why?
//
//Because of thread scheduling (controlled by OS + JVM)
//
//You started t1, t2, t3
//But who runs first is NOT guaranteed