package OopsByKK.staticExample;

public class WhyMainIsStatic {

    int num=10;

    public void show(){

        System.out.println(" non static method ");
    }

    static void display(){
        System.out.println(" static method ");

    }

    public static void main(String[] args) {

        WhyMainIsStatic obj=new WhyMainIsStatic();
        obj.show();
        display();

    }
}
