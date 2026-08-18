package Java8Features.DilipSir.MethodReference.ArbitaryMethodReference;

import java.util.Arrays;

public class MethodReference {

    public static void main(String[] args) {

        String[] values={"Dilip","Java","Spring","Methods","Reference"};

        // using lambda expression
        // Arrays.sort(values,(a,b)->a.compareToIgnoreCase(b));

       // using method reference
        Arrays.sort(values,String::compareToIgnoreCase);

        for (String s:values){
            System.out.println(s);
        }


    }



}
