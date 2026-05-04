package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<String> names = new ArrayList<>();
        names.add("Rohit Sharma");
        names.add("Devdutt Padikkal");
        names.add("MS Dhoni");
        names.add("Virat Kohli");
        names.add("Abhishek Sharma");


        // sort names in ascending order
        List<String> res = names.stream().sorted().collect(Collectors.toList());
        System.out.println(res);

        // sort names according to length wise
        List<String> res1 = names.stream().sorted((s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            if (l1 < l2) return -1;
            else if (l1 > l2) return +1;
            else return s1.compareTo(s2);
        }).collect(Collectors.toList());
        System.out.println(res1);



        List<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(1);
        number.add(5);
        number.add(15);
        number.add(20);

        System.out.println(number);

        Integer min=number.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println(min);

        Integer max=number.stream().max((a,b)->a.compareTo(b)).get();
        System.out.println(max);


        // print element from the list

        List<Integer> num=new ArrayList<>();
        num.add(50);
        num.add(100);
        num.add(150);
        num.add(200);
        num.add(250);

        num.stream().forEach(System.out::println);



        List<Double> d=new ArrayList<>();
        d.add(19.0);
        d.add(21.1);
        d.add(13.5);
        d.add(112.45);
        d.add(53.76);

        Double[] ans=d.stream().toArray(Double[]::new);
        Stream.of(ans).forEach(System.out::println);





    }
}
