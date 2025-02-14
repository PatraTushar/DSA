package OopsByKK.Singleton;

public class Singleton {

    private Singleton(){

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



    }
}
