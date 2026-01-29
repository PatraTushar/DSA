package JvmAndGarbageCollection;

public class TestD {

    public void finalize(){

        System.out.println(" finalize method called ");
    }

    public static void main(String[] args) {

        TestD t=new TestD();
        t.finalize();
        t.finalize();
        t=null;
        System.gc();
        System.out.println(" end of main ");
    }
}
