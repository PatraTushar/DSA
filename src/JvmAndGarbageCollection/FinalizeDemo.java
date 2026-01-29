package JvmAndGarbageCollection;

public class FinalizeDemo {

    static FinalizeDemo s;

    public void finalize(){

        System.out.println(" finalize method called");
        s=this;
    }

    public static void main(String[] args) throws Exception {

        FinalizeDemo f=new FinalizeDemo();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println(" end of main ");



    }
}
