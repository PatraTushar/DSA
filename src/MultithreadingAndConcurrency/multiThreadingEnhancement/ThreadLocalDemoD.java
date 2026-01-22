package MultithreadingAndConcurrency.multiThreadingEnhancement;

class ParentThreadA extends Thread {

  public static InheritableThreadLocal tl=new InheritableThreadLocal(){

        public Object childValue(Object p){

            return "CC";

        }
    };

    @Override
    public void run() {

        tl.set("PP");
        System.out.println(" parent value : "+tl.get());


        ChildThreadA ct=new ChildThreadA();
        ct.start();
    }
}

class ChildThreadA extends Thread {

    @Override
    public void run() {

        System.out.println(" child value : " +ParentThreadA.tl.get());
    }
}

public class ThreadLocalDemoD {

    public static void main(String[] args) {

        ParentThreadA pt=new ParentThreadA();
        pt.start();


    }
}
