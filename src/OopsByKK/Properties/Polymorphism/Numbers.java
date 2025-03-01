package OopsByKK.Properties.Polymorphism;

public class Numbers {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, String b) {
        return a;
    }

    String sum(String a, int b) {
        return a;
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers();
        int a = obj.sum(1, 2);
        System.out.println(a);

        int b = obj.sum(10, 20, 30);
        System.out.println(b);


        int c = obj.sum(133, "kunal");
        System.out.println(c);


        String d = obj.sum("Tushar", 25);
        System.out.println(d);

    }
}
