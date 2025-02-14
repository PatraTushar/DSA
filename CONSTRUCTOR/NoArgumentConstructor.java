package CONSTRUCTOR;
public class NoArgumentConstructor {

     static class Test{

        Test(){
            System.out.println("no argument constructor");
        }
    }

    public static void main(String[] args) {

        Test t=new Test();
    }
}
