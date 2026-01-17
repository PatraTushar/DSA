package MultithreadingAndConcurrency.synchronization;

class DisplayC {

    public synchronized void  displayN() {

        for (int i = 1; i <= 10; i++) {

            System.out.print(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }


    }

    public synchronized void displayC() {

        for (int i = 65; i <= 75; i++) {

            System.out.print((char) i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }

    }
}


class myThreadI extends Thread {

    DisplayC d;

    myThreadI(DisplayC d) {

        this.d = d;
    }

    @Override
    public void run() {
        d.displayN();
    }
}

class myThreadII extends Thread {

    DisplayC d;

    myThreadII(DisplayC d) {

        this.d = d;
    }

    @Override
    public void run() {
        d.displayC();
    }
}

public class synchronizedDemoC {

    public static void main(String[] args) {

        DisplayC obj = new DisplayC();

        myThreadI t1 = new myThreadI(obj);
        myThreadII t2 = new myThreadII(obj);
        t1.start();
        t2.start();


    }
}
