package OOPS.Generics.GenericMethod.T_extends_Type;

public class Method_Returning_Bounded_Type {

    //Example 1: Return the Max of Two Numbers
    public static class BoundedReturnExample{

        public static <T extends Number> T getLarger(T a,T b){

            //Yes — for object types (like Integer, Double, String, or any custom class), you cannot use comparison operators (<, >, <=, >=). So we use these alternatives depending on the type:

            if(a.doubleValue() > b.doubleValue()) return a;

            return b;
        }


    }

    public static void main(String[] args) {



        Integer result = BoundedReturnExample.getLarger(10, 20);
        System.out.println("Larger: " + result);

        Double d = BoundedReturnExample.getLarger(5.5, 2.2);
        System.out.println("Larger: " + d);




    }
}
