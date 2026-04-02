import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class myPractice {



        public static void main(String[] args) throws Exception {


            CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            Iterator<String> itr=list.iterator();
            list.add("D");

            while (itr.hasNext()){

                System.out.println(itr.next());
            }

            System.out.println(list);

    }



}





