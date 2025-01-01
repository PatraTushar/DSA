
package CONSTRUCTOR;
public class Parametrizedconstructor {

   static class Test{

        Test(int a){
            System.out.println("parametrized constructor");
        }

    }

    public static void main(String[] args) {
        Test t=new Test(10);

    }
}
