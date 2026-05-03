


public class myPractice {

    static void m1() {

        for (int i = 0; i < 10; i++) {

            System.out.println(" child thread ");
        }
    }

    public static void main(String[] args) {

        Runnable r = myPractice::m1;

        Thread t=new Thread(r);

        for (int i=0;i<10;i++){

            System.out.println(" main thread ");
        }

    }

}





