package OOPS.Generics.GenericMethod.T_extends_Type.GenericMethodInsideGenricClass;

public class Generic_Method_using_the_same_class_type_T {

    public static class Box<T>{

        private T item;

        public void setItem(T item){

            this.item=item;
        }

        public T getItem(){

            return item;
        }

        //  method using class's type parameter T
        public void displayItemType(T item) {
            System.out.println("Item type: " + item.getClass().getSimpleName());
        }


    }

    public static void main(String[] args) {

        Box<String> box=new Box<>();
        box.setItem("Hello");
        box.displayItemType("world");


    }
}
