package OopsByKK.Generics.Basics;

public class objectBox {

    private Object item;

    public void setItem(Object item){
        this.item=item;
    }

    public Object getItem(){
        return item;
    }



    public static void main(String[] args) {

        // without generics

        objectBox a=new objectBox();
        a.setItem(" hello ");
        String message=(String) a.getItem();  // Casting is needed
        System.out.println(message);

        a.setItem(11);
        Integer message1=(Integer) a.getItem();
        System.out.println(message1);



    }
}
