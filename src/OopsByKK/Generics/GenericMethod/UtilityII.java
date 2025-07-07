package OopsByKK.Generics.GenericMethod;



public class UtilityII {

    public static <T extends Number> void  showDouble(T num){

        System.out.println(" Double value: " + num.doubleValue());


    }



    public static void main(String[] args) {

        // Example 1: Upper Bound with extends

        UtilityII.showDouble(10);
        UtilityII.showDouble(3.14);
      //  UtilityII.showDouble(" Hello ");




    }
}
