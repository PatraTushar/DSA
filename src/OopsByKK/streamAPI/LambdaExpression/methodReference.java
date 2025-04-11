package OopsByKK.streamAPI.LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

class MobilePhone{
    String name;

    MobilePhone(String name){
        this.name=name;
    }
}
public class methodReference {



    public static void main(String[] args) {

        //methodReference->use method without invoking and in place of lambda expression


        List<String> students= Arrays.asList("Ram","Rohit","Rohan");
        students.forEach((e-> System.out.print(e +" ")));
        System.out.println();
        students.forEach(System.out::println);

        // constructor reference

        List<String> names=Arrays.asList("A","B","c");
        List<MobilePhone> mobilePhoneList=names.stream().map(MobilePhone::new).collect(Collectors.toList());



    }
}
