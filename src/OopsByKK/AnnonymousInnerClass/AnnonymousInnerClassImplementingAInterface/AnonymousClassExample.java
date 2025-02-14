package OopsByKK.AnnonymousInnerClass.AnnonymousInnerClassImplementingAInterface;


interface printer{
    void print();
}
public class AnonymousClassExample {

    public static void main(String[] args) {


        printer obj = new printer() {
            @Override
            public void print() {
                System.out.println(" printing document ");
            }
        };
        obj.print();

    }
}
