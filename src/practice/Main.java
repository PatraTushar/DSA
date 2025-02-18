package practice;

class animal{
    void eat(){

        System.out.println(" animal is eating ");
    }
}


class dog extends animal{

    void bark(){
        System.out.println(" dog barks ");
    }

    void eat(){
        System.out.println(" dog is eating ");
    }
}

class cat extends animal{

    void meow(){

        System.out.println(" cat meow ");
    }
}

class elephant extends animal{
    void trumph(){
        System.out.println(" elephant trumph ");
    }
}

public class Main {

    public static void main(String[] args) {

        animal obj=new animal();
        obj.eat();

        dog obj2=new dog();
        obj2.eat();
        obj2.bark();






    }
}
