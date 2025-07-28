import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;

public class myPractice {


    static void HashMap() {

        Map<String, Integer> mp = new HashMap<>();

        String[] players = {"Rahul", "Siraj", "Gill", "Bumrah", "Rohit"};
        Integer[] score = {100, 90, 40, 23, 200};

        for (int i = 0; i < players.length; i++) {

            mp.put(players[i], score[i]);
        }

        System.out.println(mp);


        System.out.println(mp.get("Siraj"));
        System.out.println(mp.get("jaiswal"));


        mp.put("Karun", 300);
        System.out.println(mp);

        mp.put("Siraj", 10);
        System.out.println(mp);


        System.out.println(mp.containsKey("Rohit"));
        System.out.println(mp.containsKey("Shami"));

        mp.putIfAbsent("Ashwin", 10);
        mp.putIfAbsent("Rahul", 250);

        System.out.println(mp);


        System.out.println(mp.keySet());

        System.out.println(mp.values());


        System.out.println(mp.entrySet());


        for (String num : mp.keySet()) {

            System.out.println(num + " score is " + mp.get(num));
        }


        for (Map.Entry<String, Integer> ele : mp.entrySet()) {

            System.out.println(ele.getKey() +" score is "+ ele.getValue());


        }


    }

    public static void main(String[] args) {

        HashMap();

    }


}
