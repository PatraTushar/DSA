package OopsByKK.Introduction;

public class wrapperExample {

   static class A{
        final int num=10;
        String name;

       public A(String name){
            this.name=name;
        }
    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {

        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a + " " + b);

        final A kunal=new A("rohit sharma");
        kunal.name="other name";
        System.out.println(kunal.name);

        // when a non primitive is final you cant reassign it(non-primitive is A)
        // kunal=new A(" new object ");



    }
}
