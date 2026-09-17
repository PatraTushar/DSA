package java_Jspider;

public class TypeCasting {

    public static void main(String[] args) {

        int a = 100;
        long a1 = (long) a;
        System.out.println(a1);

        long l = 200L;
        float f = (float) l;
        System.out.println(f);

        double d = 345.65;
        int d1 = (int) d;
        System.out.println(d1);

        double d2 = 123.43;
        long l2 = (long) d2;
        System.out.println(l2);

        char ch='a';
        int e=(int)ch;
        System.out.println(e);

        int as=100;
        char c=(char) as;
        System.out.println(c);
    }
}
