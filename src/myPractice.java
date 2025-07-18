
interface Running {

    void run();

}

interface Eating {

    void eat();
}

class Elephant {

    void trunc() {

        System.out.println(" elephant trunc ");
    }
}

public class myPractice {


    public static class GenericClass<T> {

     public static <U extends Number> void print(U ele){
         System.out.println(ele.doubleValue());
     }


    }


    public static void main(String[] args) {









    }

}