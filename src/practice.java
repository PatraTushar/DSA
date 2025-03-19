
interface Animal{
    void eat();
    void fun();

}

class Dog implements Animal{

  public  void eat(){

      System.out.println(" eating ");

    }

    public void fun(){
        System.out.println(" enjoying ");
    }
}


   public  class practice {

    public static void main(String[] args) {

        Dog obj=new Dog();
        obj.fun();
        obj.eat();





    }

}