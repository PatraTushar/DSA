package ArraysbyStriver.Basics;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;

public class unionOfTwoSortedArray {
    //using hashmap

    static HashSet unionOf2Arr(int arr1[],int arr2[]){

        HashSet<Integer> set=new HashSet<>();
        int n1=arr1.length;
        int n2= arr2.length;

        for(int a:arr1){
            set.add(a);

        }

        for(int b:arr2){
            set.add(b);
        }

        return set;





    }

    static ArrayList<Integer> union(int arr1[],int arr2[]){

         ArrayList<Integer> result=new ArrayList<>();

         int i=0;
         int j=0;

         while(i<arr1.length && j<arr2.length){

             while(i< arr1.length-1 && arr1[i]==arr1[i+1]){
                 i++;
             }

             while(j<arr2.length && arr2[j]==arr2[j+1]){
                 j++;
             }

             if(arr1[i]<arr2[j]){
                 result.add(arr1[i]);
                 i++;
             }

             else if(arr2[j]<arr1[i]){
                 result.add(arr2[j]);
                 j++;
             }

             else{

                 result.add(arr1[i]);
                 i++;
                 j++;
             }



         }

         while(i<arr1.length){

             if(i< arr1.length-1 && arr1[i]==arr1[i+1]){
                 i++;
             }

             else{
                 result.add(arr1[i]);
                 i++;
             }

         }

        while(j<arr2.length){

            if(j< arr2.length-1 && arr2[j]==arr2[j+1]){
                j++;
            }

            else{
                result.add(arr2[j]);
                j++;
            }

        }

        return result;






    }

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        ArrayList ans=union(arr1,arr2);
        System.out.println(ans);
        int arr3[]={7,3,9};
        int arr4[]={6,3,9,2,9,4};
        HashSet answer=unionOf2Arr(arr3,arr4);
        System.out.println(answer);
    }
}
