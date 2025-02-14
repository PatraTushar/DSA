package OopsByKK.Properties.Inheritance.SingleInheritance;

import OopsByKK.AccessModifier.Public.A;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight(){

        this.weight=-1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    public BoxWeight(double length,double height,double width,double weight){



        super(length,width,height );  // what is this ? call the parent class constructor
        // used to initialise values present in parent class
        this.weight=weight;


    }




}
