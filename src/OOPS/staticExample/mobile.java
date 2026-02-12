package OOPS.staticExample;

public class mobile {


    static String name;
    int price;

    String brand;

    mobile(String name, int price, String brand) {

        mobile.name = name;
        this.price = price;
        this.brand = brand;
    }

    public void show() {
        System.out.println(name + " : " + price + " : " + brand);
    }


    public static void main(String[] args) {


        mobile m1 = new mobile("smartphone",10000,"samsung");
        System.out.println(mobile.name);
        mobile m2 = new mobile("smartphone", 20000, "apple");
        System.out.println(mobile.name);

        m1.name = "phone";
        m1.show();
        m2.show();


    }
}
