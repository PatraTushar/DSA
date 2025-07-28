package Hashmap.Hashing;

import java.util.HashSet;

public class unionOfTwoArrays {

    static HashSet unionOf2Arr(int arr1[],int arr2[]){

        HashSet<Integer> set=new HashSet<>();


        for(int a:arr1){
            set.add(a);

        }

        for(int b:arr2){
            set.add(b);
        }

        return set;





    }

    public static void main(String[] args) {

        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet answer=unionOf2Arr(arr1,arr2);
        System.out.println(answer);

    }
}
