

class myThread extends Thread {


    String name;

    myThread(  String name) {


        this.name = name;
    }



}

public class mainClass {


    public static void main(String[] args) {




        myThread t1 = new myThread( "virat");
        System.out.println(t1.getName());
        myThread t2 = new myThread( "rohit");
       System.out.println(t2.getName());
        myThread t3 = new myThread( "rahul");
       System.out.println(t3.getName());
        myThread t4 = new myThread( "hardik");
        System.out.println(t4.getName());

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}


