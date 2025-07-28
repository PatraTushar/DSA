package Hashmap.Basics;

public class PerfectHashFunction {


    static int perfectHash(String keys){

        switch (keys){

            case "apple" : return 0;

            case "banana": return 1;

            case "cherry" : return 2;

            default: throw new IllegalArgumentException("Invalid key: " + keys);
        }


    }

    public static void main(String[] args) {

        String[] keys={"apple", "banana", "cherry"};

        String[] table=new String[keys.length];

        for (String ele:keys){

            int index=perfectHash(ele);
            table[index]=ele;
        }


        for(int i=0;i<table.length;i++){

            System.out.println("Index " + i + ": " + table[i]);
        }

    }
}
