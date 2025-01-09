package functionsByKK;

public class Scope {

    public static void main(String[] args) {

        int a=20;
        int b=10;

        {
            a=300;  // reassign the original reference variable to other value
            System.out.println(a);

            // value initialised in the block remains in the block only
        }
        System.out.println(a);


    }
}
