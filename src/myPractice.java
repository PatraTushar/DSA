import java.util.ArrayList;
import java.util.List;

public class myPractice {




    static void add(List<? super Number> list){

      list.add(1.5);
      list.add(2);
        System.out.println(list);
    }


    public static void main(String[] args) {

        List<String> obj= List.of("raj","rahul");

        List<Number> obj2=new ArrayList<>();
        obj2.add(1);

       List<Double> obj3=List.of(1.2,2.2,3.3);

        add(obj2);



    }


}
