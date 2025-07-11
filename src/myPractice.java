import java.util.ArrayList;
import java.util.List;

public class myPractice {

    static <T> void copy(List<? super T> dest,List<? extends T > src){

        //“In the parameter, it will first check the extends type — what is the type?”
       // “The T is Integer, so it will go and replace the T of super automatically.”
        //“As dest is of type Number, it can accept Integer.”

        //"Where you are adding (i.e., dest), always try to keep it as a supertype, so adding a subtype is possible."


        for(T ele :src){

            dest.add(ele);
        }

        System.out.println(dest);


    }

    public static void main(String[] args) {

        List<Integer> src=List.of(1,2,3,4,5);
        List<Number> dest=new ArrayList<>();


        copy(dest,src);


    }
}
