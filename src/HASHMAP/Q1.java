package HASHMAP;


import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        int arr[]={1,4,2,5,1,4,4,6,4,4,4,6,2,2};

        Map<Integer,Integer> mp=new HashMap();

        for(int el : arr){

            if(!mp.containsKey(el)){
                mp.put(el,1);
            }

            else{

                mp.put(el,mp.get(el)+1);
            }
        }

        System.out.println(" frequency map ");
        System.out.println(mp.entrySet());

        int maxfreq=0,ansKey=0;

        for(var e : mp.entrySet()){

            if(e.getValue()>maxfreq){
                maxfreq= e.getValue();
                ansKey=e.getKey();
            }
        }

        System.out.printf(" %d has max frequency and it occurs %d times " , ansKey, maxfreq);


    }
}
