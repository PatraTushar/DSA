package OopsByKK.LambdaFunction.LambdaExpressionsWithMultipleParameter;

interface MathOperation{

    int operation(int a,int b);
}
public class LambdaWithMultipleParameter {

    public static void main(String[] args) {

        MathOperation obj=(a,b)->a + b;
        System.out.println(" addition " +obj.operation(5,3));

    }
}
