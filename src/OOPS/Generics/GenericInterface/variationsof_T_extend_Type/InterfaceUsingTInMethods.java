package OOPS.Generics.GenericInterface.variationsof_T_extend_Type;

public class InterfaceUsingTInMethods {
}

interface Store<T extends Number>{

    void addItem(T item);
    T getItem();
}

class FloatStore implements Store<Float>{

    private Float value;

    public void addItem(Float item) {
        this.value = item;
    }

    public Float getItem() {
        return value;
    }


}

class Main4{

    public static void main(String[] args) {

        Store<Float> store=new FloatStore();
        store.addItem(100.45f);
        System.out.println("Stored value: " +store.getItem());
    }
}
