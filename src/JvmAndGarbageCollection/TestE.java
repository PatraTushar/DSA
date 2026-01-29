package JvmAndGarbageCollection;

public class TestE {

    static int count = 0;

    public void finalize() {

        System.out.println(" finalize method called "+ ++count);


    }

    public static void main(String[] args) {

        for (int i = 0; i < 10000000; i++) {

            TestE t=new TestE();
            t=null;
        }



    }
}
