package OopsByKK.LambdaExpression.fuctionalInterface;

public class ThreadDemo {

    public static void main(String[] args) {

        // First Thread : Thread-JOHN

        Runnable obj=()-> {

            for (int i = 1; i <= 10; i++) {
                System.out.println(" value of i is " + i);


                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        };

      ///  obj.run();

        Thread th=new Thread(obj);
        th.setName(" john ");
        th.start();

    }
}
