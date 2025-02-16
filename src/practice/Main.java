package practice;

class Address{

    String city;

    Address(String city){

        this.city=city;
    }

}

class Person implements Cloneable{

    String name;
    int age;
    Address add;

    Person(String name,int age,Address add){
        this.name=name;
        this.age=age;
        this.add=add;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}



public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address obj=new Address("uk");
        Person obj2=new Person("kunal",12,obj);
        Person obj3=(Person) obj2.clone();

        System.out.println(obj.city);
        System.out.println(obj2.add.city);
        System.out.println(obj3.add.city);

        obj3.add.city="nepal";


        System.out.println(obj.city);
        System.out.println(obj2.add.city);
        System.out.println(obj3.add.city);





    }
}
