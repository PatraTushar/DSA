
import java.util.WeakHashMap;

public class myPractice {

    static class Temp {

        @Override
        public String toString() {

            return "temp";
        }

        public void finalize() {

            System.out.println(" finalize method is called ");
        }
    }

    public static void main(String[] args) throws Exception {


        WeakHashMap<Temp, String> map = new WeakHashMap<>();

        Temp t = new Temp();

        map.put(t, "durga");
        System.out.println(map);

        t = null;

        System.gc();

        Thread.sleep(3000);

        System.out.println(map);





    }


}





