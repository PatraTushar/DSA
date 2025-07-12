package Hashing;

import java.util.HashSet;

public class intersectionOfTwoArrays {

    static HashSet intersectionOf2Arr(int arr1[],int arr2[]){

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();


        for(int a:arr1){
            set.add(a);
        }

        for(int b:arr2){
            if(set.contains(b)){

                result.add(b);
            }
        }

        return result;
    }

    public static void main(String[] args) {


        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet answer=intersectionOf2Arr(arr1,arr2);
        System.out.println(answer);
    }
}
