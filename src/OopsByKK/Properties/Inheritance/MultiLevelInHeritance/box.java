package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class box {

    double length;
    double breadth;
    double height;

    box(){

        this.length=10;
        this.breadth=20;
        this.height=30;
    }

    box(double side){

        this.length=side;
        this.breadth=side;
        this.height=side;

    }

    box(double length,double breadth,double height){

        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    box(box other){
        this.length=other.length;
        this.breadth=other.breadth;
        this.height=other.height;
    }

    void message(){

        System.out.println(" box class ");
    }

    public static void main(String[] args) {

    }
}
