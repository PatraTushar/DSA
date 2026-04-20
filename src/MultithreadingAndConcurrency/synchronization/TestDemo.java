package MultithreadingAndConcurrency.synchronization;

class Demo {

    // 1. Static synchronized method (CLASS LOCK)
    public static synchronized void staticSyncMethod() {
        System.out.println(Thread.currentThread().getName() + " entered staticSyncMethod");
        try { Thread.sleep(3000); } catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + " exiting staticSyncMethod");
    }

    // 2. Normal static method (NO LOCK)
    public static void normalStaticMethod() {
        System.out.println(Thread.currentThread().getName() + " executing normalStaticMethod");
    }

    // 3. Synchronized instance method (OBJECT LOCK)
    public synchronized void instanceSyncMethod() {
        System.out.println(Thread.currentThread().getName() + " entered instanceSyncMethod");
        try { Thread.sleep(3000); } catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + " exiting instanceSyncMethod");
    }

    // 4. Normal instance method (NO LOCK)
    public void normalInstanceMethod() {
        System.out.println(Thread.currentThread().getName() + " executing normalInstanceMethod");
    }
}


class MyThreadA extends Thread {
    public void run() {
        Demo.staticSyncMethod(); // CLASS LOCK
    }
}

class MyThreadB extends Thread {
    public void run() {
        Demo.staticSyncMethod(); // CLASS LOCK
    }
}

class MyThreadC extends Thread {
    Demo obj;

    MyThreadC(Demo obj) {
        this.obj = obj;
    }

    public void run() {
        obj.instanceSyncMethod(); // OBJECT LOCK
    }
}

class MyThreadD extends Thread {
    public void run() {
        Demo.normalStaticMethod(); // NO LOCK
    }
}


public class TestDemo {
    public static void main(String[] args) {

        Demo obj = new Demo();

        MyThreadA t1 = new MyThreadA();
        MyThreadB t2 = new MyThreadB();
        MyThreadC t3 = new MyThreadC(obj);
        MyThreadD t4 = new MyThreadD();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
