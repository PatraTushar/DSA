package JvmAndGarbageCollection;

class StudentA {

    public String getName() {

        return null;
    }

    public int getRollNo() {

        return 10;
    }

}

public class TestA {

    public static void main(String[] args) {

        StudentA s1=new StudentA();
        Class c1=s1.getClass();
        System.out.println(c1);


        StudentA s2=new StudentA();
        Class c2=s2.getClass();
        System.out.println(c2);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(s1==s2);


    }
}
