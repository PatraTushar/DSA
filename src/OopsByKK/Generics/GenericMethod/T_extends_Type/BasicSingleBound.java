package OopsByKK.Generics.GenericMethod.T_extends_Type;

public class BasicSingleBound {

    public static class Demo{

        public <T extends Number> void printDoubleValue(T val){

            double result=val.doubleValue();
            System.out.println("Double value: " + result);



        }

        public static void main(String[] args) {

            Demo obj=new Demo();
            obj.printDoubleValue(10);
            obj.printDoubleValue(5.67f);
            obj.printDoubleValue(3.14155);

        }
    }
}


