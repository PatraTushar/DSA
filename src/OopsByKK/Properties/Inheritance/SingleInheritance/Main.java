package OopsByKK.Properties.Inheritance.SingleInheritance;

public class Main {

    public static void main(String[] args) {

//        Box obj=new Box(10,20,30);
//        System.out.println(obj.length  +" : "+  obj.width +" : "+ obj.height );
//        Box obj2=new Box(obj);
//        System.out.println(obj2.length  +" : "+  obj2.width +" : "+ obj2.height );
//        obj.information();


        BoxWeight obj3=new BoxWeight(10,20,30,40);
        System.out.println(obj3.weight);

        Box obj4=new BoxWeight(100,200,300,400);
        System.out.println(obj4.height);


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the reference type i.e. BoxWeight
        // hence you should have access to weight variable
        // this also means,that the ones you are trying to access should be initialized
        //but here when the object itself is a type parent class,how will you call the constructor
        // this is why error
        // BoxWeight obj5=new Box(1,2,3);
        //System.out.println(obj5);


    }
}
