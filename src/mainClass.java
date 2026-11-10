
class Display {

    synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {

            System.out.print(" Good Morning ");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }

            System.out.println(name);
        }
    }
}


class myThread extends Thread {

    Display d;
    String name;

    myThread(Display d, String name) {

        this.d = d;
        this.name = name;
    }


    @Override
    public void run() {

        d.wish(name);
    }
}

public class mainClass {


    public static void main(String[] args) {

        Display d = new Display();

        myThread t1 = new myThread(d, "virat");
      //  System.out.println(t1.getName());
        myThread t2 = new myThread(d, "rohit");
      //  System.out.println(t2.getName());
        myThread t3 = new myThread(d, "rahul");
      //  System.out.println(t2.getName());
        myThread t4 = new myThread(d, "hardik");
        //System.out.println(t4.getName());

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}


