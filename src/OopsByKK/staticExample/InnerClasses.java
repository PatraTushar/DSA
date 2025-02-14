package OopsByKK.staticExample;

//class Test{
//    String name;
//
//    Test(String name){
//        this.name=name;
//    }
//}

public class InnerClasses {

       static class Test{
        String name;

        Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {

        Test obj=new Test("rahul");
        Test obj2=new Test("rohan");

        System.out.println(obj.name);
        System.out.println(obj2.name);







    }
}
