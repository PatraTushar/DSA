package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class boxWeight extends box {

    double weight;

    boxWeight(){

        super();
        this.weight=45.5;

    }

    boxWeight(double side){
        super(side);
        this.weight=side;
    }

    boxWeight(double length,double breadth,double height,double weight){
        super(length,breadth,height);
        this.weight=weight;
    }

    boxWeight(boxWeight another){
        super(another);
        this.weight=another.weight;
    }



    public static void main(String[] args) {


    }
}
