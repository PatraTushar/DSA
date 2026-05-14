import java.util.ArrayList;
import java.util.List;

public class myPractice {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (String s : list) {

            if (s.equals("B"))list.remove(s);
        }

        System.out.println(list);


    }


}





