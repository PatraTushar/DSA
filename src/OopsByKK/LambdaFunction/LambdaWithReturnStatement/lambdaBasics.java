package OopsByKK.LambdaFunction.LambdaWithReturnStatement;


interface MathFunction{

    int square(int x);
}
public class lambdaBasics {

    public static void main(String[] args) {

        MathFunction obj=(x) -> { return x * x ;};

        System.out.println(" square is " +obj.square(4));


    }
}
