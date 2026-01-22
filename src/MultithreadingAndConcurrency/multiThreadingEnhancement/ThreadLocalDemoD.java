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


// In the above program  if we replace InheritableThreadLocal with ThreadLocal and if we are not overriding childValue() method then the op is " parent value : PP "  and  " child value : null "
// In the above program if we are maintaining InheritableThreadLocal and if we are  not overriding childValue() method then the op is  " parent value : PP "  and  " child value : PP "

