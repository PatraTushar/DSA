

class ThreadB extends Thread {

    int total;

    @Override
    public void run() {

        synchronized (this) {

            System.out.println(" entered  into child thread  ");

            System.out.println(" child thread perform calculation ");


            for (int i = 1; i <= 100; i++) {

                total += i;
            }




            System.out.println(" child calls notify ");

            this.notify();



        }
    }
}

class ThreadA {

    public static void main(String[] args) throws InterruptedException {

        ThreadB obj = new ThreadB();

        obj.start();

        synchronized (obj) {

            System.out.println(" main thread want to perform updation and it call wait() ");

            obj.wait();

            System.out.println(" main thread got notification ");

            System.out.println(obj.total);


        }
    }


}


public class myPractice {


}

