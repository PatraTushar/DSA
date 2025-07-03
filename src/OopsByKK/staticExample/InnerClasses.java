package OopsByKK.staticExample;


public class InnerClasses {

       static class Test{
        String name;

        Test(String name){
            this.name=name;
        }

        void dance(){
            System.out.println(" hje dance");
        }
    }

    void sing(){
        System.out.println(" he sings ");
    }

    public static void main(String[] args) {

        Test obj=new Test("rahul");
        Test obj2=new Test("rohan");

        System.out.println(obj.name);
        System.out.println(obj2.name);

       // InnerClasses ob=new InnerClasses();
        Test we=new Test("fn");
        we.dance();

        InnerClasses object=new InnerClasses();
        object.sing();








    }
}
