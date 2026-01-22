package MultithreadingAndConcurrency.multiThreadingEnhancement;

class ParentThread extends Thread {

   // static ThreadLocal tl=new ThreadLocal();   //  if You want parent value as PP and child value as null
    static InheritableThreadLocal tl=new InheritableThreadLocal();     // if you want both parent and child value as PP

    @Override
    public void run() {

        tl.set("PP");
        System.out.println(" parent value : "+tl.get());


        ChildThread ct=new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread {

    @Override
    public void run() {

        System.out.println(" child value : " +ParentThread.tl.get());
    }
}

public class ThreadLocalDemoC {

    public static void main(String[] args) {

        ParentThread pt=new ParentThread();
        pt.start();


    }
}
