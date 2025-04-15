package HASHMAP;

import java.util.*;

public class practice {

    static Map.Entry<Integer,Integer> findMaxFreq(int[] arr){

        Map<Integer,Integer> mp=new HashMap<>();



        for(int i=0;i<arr.length;i++){

            if(!mp.containsKey(arr[i])){

                mp.put(arr[i],1);

            }

            else {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }

        System.out.println(mp);

        int maxFreq=0;
        int ansKey=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }

        return new AbstractMap.SimpleEntry<>(ansKey, maxFreq);



    }

    public static void main(String[] args) {

        Map<Integer,Integer> mp=new HashMap<>();

        int[] arr={1,3,2,1,4,1};



        Map.Entry<Integer,Integer> ans=findMaxFreq(arr);

        System.out.printf(" %d has max frequency and it occurs %d times\n", ans.getKey(), ans.getValue());








    }
}
