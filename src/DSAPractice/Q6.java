package DSAPractice;

public class Q6 {

    static void swapUsingTemporaryVariable(int a, int b) {

        System.out.println(" a-> " + a + " : " + " b-> " + b);

        int temp = a;
        a = b;
        b = temp;


        System.out.println(" a-> " + a + " : " + " b-> " + b);


    }

    static void swapUsingSumAndDiff(int p, int q) {

        System.out.println(" p-> " + p + " : " + " q-> " + q);

        p = p + q;
        q = p - q;
        p = p - q;

        System.out.println(" p-> " + p + " : " + " q-> " + q);


    }


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swapUsingTemporaryVariable(a, b);

        int p = 100;
        int q = 200;
        swapUsingSumAndDiff(p, q);
    }
}
