
class Display {


    public synchronized void printNumber() {

        for (int i = 1; i <= 10; i++) {

            System.out.print(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

        }
    }


    public synchronized void printCharacter() {

        for (int i = 65; i <= 75; i++) {

            System.out.print((char) i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }


    }
}


class myThread1 extends Thread {

    Display d;

    myThread1(Display d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.printNumber();
    }
}


class myThread2 extends Thread {

    Display d;

    myThread2(Display d) {
        this.d = d;
    }


    @Override
    public void run() {
        d.printCharacter();
    }
}


public class mainClass {


    public static void main(String[] args) {

        Display d = new Display();
        myThread1 t1 = new myThread1(d);
        myThread2 t2 = new myThread2(d);

        t1.start();
        t2.start();


    }
}


