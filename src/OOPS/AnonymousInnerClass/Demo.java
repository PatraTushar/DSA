package OOPS.AnonymousInnerClass;


// Anonymous Inner Class Inside Method Arguments
public class Demo {

    public static void main(String[] args) {

        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(" Thread Running ");
            }
        });

        t.start();


    }
}
