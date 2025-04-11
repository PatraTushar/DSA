package ArraysbyKK.Basics;

import java.util.ArrayList;
import java.util.HashSet;

public class intersectionOfTwoArray {

    // using Hashset

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

    static ArrayList<Integer> intersection(int arr1[],int arr2[]){

        ArrayList<Integer> result=new ArrayList<>();

        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]!=arr2[j]){
                i++;
            }

            else if(arr1[i]==arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;

            }

            else{
                j++;
            }
        }

        return result;


    }

    public static void main(String[] args) {

        int arr1[]={1,2,2,3,3,4,5,6};
        int arr2[]={2,3,3,5,6};
        ArrayList ans=intersection(arr1,arr2);
        System.out.println(ans);
        HashSet answer=intersectionOf2Arr(arr1,arr2);
        System.out.println(answer);
    }
}
