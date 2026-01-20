

class Display {


    public synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {

            System.out.print(" Good Morning ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
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

public class myPractice {


    public static void main(String[] args) {

        Display d1 = new Display();
        Display d2=new Display();

        myThread t1=new myThread(d1,"dhoni");
        myThread t2=new myThread(d2,"yuvraj");

        t1.start();
        t2.start();


    }

}

