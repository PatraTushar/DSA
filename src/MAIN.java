

class Test {


    public static synchronized void staticSync() {

        System.out.println(Thread.currentThread().getName() + " entered static synchronized method ");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println(Thread.currentThread().getName() + " exits static synchronized method ");

    }


    public static void normalStaticMethod() {

        System.out.println(Thread.currentThread().getName() + " executing normal static method ");


    }


    synchronized void syncMethod() {

        System.out.println(Thread.currentThread().getName() + " entered  synchronized method ");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }


        System.out.println(Thread.currentThread().getName() + " exiting synchronized method ");
    }


    void normalMethod() {

        System.out.println(Thread.currentThread().getName() + " entered normal method ");

    }

}


class myThread1 extends Thread {


    @Override
    public void run() {
        Test.staticSync();
    }
}


class myThread2 extends Thread {


    @Override
    public void run() {
        Test.staticSync();
    }
}


class myThread3 extends Thread {

    Test obj;

    myThread3(Test obj) {

        this.obj = obj;
    }

    @Override
    public void run() {
        obj.syncMethod();
    }
}


class myThread4 extends Thread {

    @Override
    public void run() {
        Test.normalStaticMethod();
    }
}


class myThread5 extends Thread {

    Test obj;

    myThread5(Test obj) {

        this.obj = obj;
    }

    @Override
    public void run() {
        obj.normalMethod();
    }
}


public class MAIN {

    public static void main(String[] args) {

        Test obj = new Test();

        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        myThread3 t3 = new myThread3(obj);
        myThread4 t4 = new myThread4();
        myThread5 t5 = new myThread5(obj);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }

}










