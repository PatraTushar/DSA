package OOPS.Generics.GenericMethod.T_extends_Type.GenericMethodInsideGenricClass;

public class Generic_Method_with_its_own_type_inside_a_Generic_Class {

    //  Generic Method with its own type <U> inside a Generic Class

    public static class Box<T>{

        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        // Generic method with its own type <U>
        public <U> void showDifferentType(U value) {
            System.out.println("Different type: " + value.getClass().getSimpleName());
        }



    }

    public static void main(String[] args) {

        Box<Integer> box=new Box<>();
        box.setItem(100);
        box.showDifferentType("Hello");
        box.showDifferentType(3.14);


    }

}
