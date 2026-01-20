
class Display {


    public synchronized void wish(String name) {

        // 10 lakh lines of code

        synchronized (Display.class) {

            for (int i = 0; i < 10; i++) {

                System.out.print(" Good morning ");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }

                System.out.println(name);
            }

        }


        // 10 lakh lines of code


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

        Display obj = new Display();

        myThread t1=new myThread(obj,"dhoni");
        myThread t2=new myThread(obj,"yuvraj");

        t1.start();
        t2.start();

    }

}

