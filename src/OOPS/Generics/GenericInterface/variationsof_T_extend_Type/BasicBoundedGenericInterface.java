package OOPS.Generics.GenericInterface.variationsof_T_extend_Type;

 public class BasicBoundedGenericInterface {
}

interface Printer<T extends Number>{

    void print(T item);
}

class IntegerPrinter implements Printer<Integer>{

    public void print(Integer item) {
        System.out.println("Printing: " + item);
    }


}


 class Main1{

     public static void main(String[] args) {

         Printer<Integer> p=new IntegerPrinter();
         p.print(100);

     }



}



