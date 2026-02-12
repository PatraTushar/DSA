package OOPS.Interfaces.Basics;

// All variables in interfaces are public,static and final
interface MathConstant{
    double PI=3.14;   // public,static ,final by default
}
public class Circle implements MathConstant {

    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    void area(){
        double result=PI* radius* radius;
        System.out.println(" area is " +result);
    }

    public static void main(String[] args) {

        Circle obj=new Circle(5);
        obj.area();

    }




}
