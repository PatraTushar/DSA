package OopsByKK.staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;

    }

    public static void main(String[] args) {


    }
}
