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
    TestDemo obj;

    MyThread1(TestDemo obj) {
        this.obj = obj;
    }

    public void run() {
        obj.syncMethod();
    }
}

class MyThread2 extends Thread {
    TestDemo obj;

    MyThread2(TestDemo obj) {
        this.obj = obj;
    }

    public void run() {
        obj.syncMethod();
    }
}

class MyThread3 extends Thread {
    TestDemo obj;

    MyThread3(TestDemo obj) {
        this.obj = obj;
    }

    public void run() {
        obj.normalMethod();
    }
}

public class Main {
    public static void main(String[] args) {

        TestDemo obj = new TestDemo(); // SAME OBJECT

        MyThreadA t1 = new MyThreadA(obj);
        MyThreadB t2 = new MyThreadB(obj);
        MyThreadC t3 = new MyThreadC(obj);

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