package OopsByKK.Generics.GenericInterface;


interface Operation<T>{

    void execute(T input);
}
public class Demo {

    public static void main(String[] args) {

        //  Example 3: Anonymous Class with Generic Interface

        Operation<String> obj=new Operation<>(){

            public void execute(String input){

                System.out.println(" Executing with: "+input);
            }


        };


        obj.execute(" Anonymous class ");




    }
}
