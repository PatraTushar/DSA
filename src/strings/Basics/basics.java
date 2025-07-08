package strings.Basics;

public class basics {

    public static void main(String[] args) {

        String a="kunal";
        System.out.println(a);
        a="kushwaha";    // new object is made
        System.out.println(a);

        String p="kunal";
        String q="kunal";
        System.out.println(p==q); // true because both the reference variable are points to same object


        String s=new String("kunal");
        String t=new String("kunal");
        System.out.println(s==t);   // false because 2 new objects are made and the reference variable points to 2 different object


        // if you want to check only values

        String name1=new String("Tushar");
        String name2=new String("Tushar");
        System.out.println(name1.equals(name2));  // true because it does not care about the reference variable it only checks the values
    }
}
