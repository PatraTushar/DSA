

class Test {

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

        Test obj;

        myThread1(Test obj) {
            this.obj = obj;
        }

        @Override
        public void run() {
            obj.syncMethod();
        }
    }


    class myThread2 extends Thread {

        Test obj;

        myThread2(Test obj) {

            this.obj = obj;
        }

        @Override
        public void run() {
            obj.syncMethod();
        }
    }


    class myThread3 extends Thread {

        Test obj;

        myThread3(Test obj) {

            this.obj = obj;
        }

        @Override
        public void run() {
            obj.normalMethod();
        }
    }


     public class MAIN {

         public static void main(String[] args) {

             Test obj=new Test();

             myThread1 t1=new myThread1(obj);
             myThread2 t2=new myThread2(obj);
             myThread3 t3=new myThread3(obj);

             t1.start();
             t2.start();
             t3.start();



         }

     }










