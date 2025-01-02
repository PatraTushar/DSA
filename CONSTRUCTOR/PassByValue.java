
package CONSTRUCTOR;
public class PassByValue {

   static void changeValue(int a){

        a *= 100;
       System.out.println("inside change value" +a);

    }


    public static void main(String[] args) {

        int a=10;
        System.out.println(" before changing value " +a);
        changeValue(a);
        System.out.println(" after changing value " +a);

    }
}
