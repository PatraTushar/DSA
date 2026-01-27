package JvmAndGarbageCollection;

import java.lang.reflect.Method;


class Student {

    public String getName() {

        return null;
    }

    public int getRollNo() {

        return 10;
    }

}

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c=Class.forName("JvmAndGarbageCollection.Student");

        Method[] m=c.getDeclaredMethods();

        int count=0;

        for (Method m1:m){

            count++;
            System.out.println(m1.getName());

        }

        System.out.println(" The number of methods : "+count);

    }
}
