package OopsByKK.Properties.Inheritance.MultiLevelInHeritance;

public class main {

    public static void main(String[] args) {

         // box class object8
        box obj1=new box();
        System.out.println(obj1.length + " : " + obj1.breadth + " : " + obj1.height);
        box obj2=new box(100);
        System.out.println(obj2.length + " : " + obj2.breadth + " : " + obj2.height);
        box obj3=new box(90,89,78);
        System.out.println(obj3.length + " : " + obj3.breadth + " : " + obj3.height);
        box obj4=new box(obj2);
        System.out.println(obj4.length + " : " + obj4.breadth + " : " + obj4.height);

        System.out.println();

        // you can have parents class reference variable pointing to child class object because as the child class object extend the parent class the child class have all the properties of parent class and as the reference variable is of type parent class we can only access parent class instance variable

        box a=new boxWeight(500,1000,1500,2000);
        System.out.println(a.length + " : " + a.breadth + " : " + a.height );

        // you cannot have child class reference variable pointing to parent class object
        // boxWeight b=new box(); --> error | why?  because if you  have parent class object then u can have only parent instance variable inside the object  and if the reference variable is of type child class and u want to access the additional properties of child class u cannot so error

        // boxWeight class object

        boxWeight obj5=new boxWeight();
        System.out.println(obj5.length + " : " + obj5.breadth + " : " + obj5.height + " : "+ obj5.weight);
        boxWeight obj6=new boxWeight(600);
        System.out.println(obj6.length + " : " + obj6.breadth + " : " + obj6.height + " : "+ obj6.weight);
        boxWeight obj7=new boxWeight(obj5);
        System.out.println(obj7.length + " : " + obj7.breadth + " : " + obj7.height + " : "+ obj7.weight);


        System.out.println();


        // boxPrice class object

        boxPrice obj8=new boxPrice();
        System.out.println(obj8.length + " : " + obj8.breadth + " : " + obj8.height + " : "+ obj8.weight + " " + obj8.price);
        boxPrice obj9=new boxPrice(20000);
        System.out.println(obj9.length + " : " + obj9.breadth + " : " + obj9.height + " : "+ obj9.weight + " " + obj9.price);
        boxPrice obj10=new boxPrice(34,45,56,67,88);
        System.out.println(obj10.length + " : " + obj10.breadth + " : " + obj10.height + " : "+ obj10.weight + " " + obj10.price);
        boxPrice obj11=new boxPrice(obj8);
        System.out.println(obj11.length + " : " + obj11.breadth + " : " + obj11.height + " : "+ obj11.weight + " " + obj11.price);




        // parent class=boxWeight     child class=boxPrice
        boxWeight obj12=new boxPrice();
        System.out.println(obj12.length + " : " + obj12.breadth + " : " + obj12.height + " : "+ obj12.weight );

       // boxPrice obj13=new boxWeight(); --> error
       //reason--> because if you  have parent class object then u can have only parent instance variable inside the object  and if the reference variable is of type child class and u want to access the additional properties of child class u cannot so error



    }
}
