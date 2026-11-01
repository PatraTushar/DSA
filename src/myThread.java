public class myThread {


    static int f2() {

        return 3;
    }

    static void f1(int a, int b) {


        System.out.println(a + b);
    }

    public static void main(String[] args) {


        f1(100,f2());

    }


}

