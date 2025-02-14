package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class boxPrice extends boxWeight {

    double price;

    boxPrice(){
        super();
        this.price=10000;
    }

    boxPrice(double side){
        super(side);
        this.price=side;
    }

    boxPrice(double length,double breadth,double height,double weight,double price){
        super(length,breadth,height,weight);
        this.price=price;
    }

    boxPrice(boxPrice otherName){
        super(otherName);
        this.price= otherName.price;

    }

    public static void main(String[] args) {

    }
}
