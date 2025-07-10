package OopsByKK.Generics.Wildcards;

import java.util.*;

import java.util.List;

public class LowerBound {

    public static void addIntegers(List<? super Integer> list){

        list.add(100);
        list.add(200);




    }

    public static void main(String[] args) {

        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        addIntegers(numList);
        addIntegers(objList);

    }
}
