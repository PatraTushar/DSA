package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streams {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        // filter the even elements

        List<Integer> isEven = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(isEven);


        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);

        long failedStudent = marks.stream().filter(i -> i < 35).count();
        System.out.println(failedStudent);

        List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> Desc = marks.stream().sorted((a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0).collect(Collectors.toList());
        System.out.println(Desc);


    }
}
