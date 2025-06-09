package ArraysbyKK.strivers;

import OopsByKK.AccessModifier.Public.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {

    static List<Integer> Intersection(int[] arr1,int[] arr2){

        // Duplicates

        //Time Complexity (TC): O(n + m)
        //Space Complexity (SC): O(min(n, m))

        int i=0;
        int j=0;

        ArrayList<Integer> list=new ArrayList<>();


        while (i<arr1.length && j<arr2.length){

            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;


            }


            else if(arr1[i]<arr2[j]) {
                i++;

            }

            else {
                j++;
            }




        }


        return list;
    }

    static int[] IntersectionWithNoDuplicates(int[] nums1,int[] nums2){

        // No duplicates

        //Time Complexity (TC): O(n log n + m log m)
        //Space Complexity (SC): O(min(n, m))

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;

        ArrayList<Integer> list=new ArrayList<>();

        while (i<nums1.length && j<nums2.length){

            if(nums1[i]==nums2[j]){

                if(list.isEmpty() || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);

                }

                i++;
                j++;


            }


            else if(nums1[i]<nums2[j]) {
                i++;

            }

            else {
                j++;
            }




        }


        int[] result=new int[list.size()];

        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }

        return result;
    }

    public static void main(String[] args) {

        // intersection of 2 arrays

        int[] arr1={1,2,2,3,3,4,5,6};
        int[] arr2={2,3,3,5,6,6,7};

        List<Integer> Ans=Intersection(arr1,arr2);
        System.out.println(Ans);
        int[] intersection=IntersectionWithNoDuplicates(arr1,arr2);
        System.out.println(Arrays.toString(intersection));


    }
}
