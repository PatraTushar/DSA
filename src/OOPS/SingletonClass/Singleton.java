package OOPS.SingletonClass;

public class Singleton {

    private Singleton(){

        System.out.println(" singleton class is created ");

    }

    private static Singleton instances;

    public static Singleton getInstances(){

        // check whether 1 obj only is created or not

        if(instances==null){
            instances=new Singleton();
        }

        return instances;

    }

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstances();
        Singleton obj2 = Singleton.getInstances();

        System.out.println(obj1 == obj2);  // ✅ true — same instance



    }
}
