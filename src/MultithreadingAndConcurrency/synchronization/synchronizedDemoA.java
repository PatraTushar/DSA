package MultithreadingAndConcurrency.synchronization;

class DisplayA {

    public synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {
            System.out.print(" Good Morning : ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println(name);

        }

    }


}

class myThreadA extends Thread {

    DisplayA d;
    String name;

    myThreadA(DisplayA d, String name) {

        this.d = d;
        this.name = name;

    }

    public void run() {

        d.wish(name);
    }
}

public class synchronizedDemoA {

    public static void main(String[] args) {

         DisplayA d1=new DisplayA();
         DisplayA d2=new DisplayA();

         myThreadA t1=new myThreadA(d1," Dhoni");
         myThreadA t2=new myThreadA(d2," Yuvraj");

         t1.start();
         t2.start();


    }
}


// Even though wish() method is synchronized we will get irregular output because threads are operating on different java objects

// conclusion : If multiple threads are operating on same java object then synchronization is required
//              If multiple threads are operating on multiple java objects then synchronization is not required
