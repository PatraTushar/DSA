package ArraysbyKK.strivers;

import HASHSET.Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2 {

    // Approach 1
    static Set<Integer> union(int[] arr1, int[] arr2){

        HashSet<Integer> set=new HashSet<>();

        for (int i: arr1){
            set.add(i);
        }

        for (int j:arr2){
            set.add(j);
        }

        return set;





    }

    // Approach 2       -->          optimal Approach

    static List<Integer> unionI(int[] arr1,int[] arr2){

        int i=0;
        int j=0;
        ArrayList<Integer> union=new ArrayList<>();

        while (i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){

                if(union.isEmpty() || arr1[i]!=union.get(union.size()-1)){

                    union.add(arr1[i]);
                }
                i++;

            }

            else if(arr1[i]>arr2[j]){

                if(union.isEmpty() || arr2[j]!=union.get(union.size()-1)){

                    union.add(arr2[j]);
                }
                j++;


            }

            else {                      //arr1[i]==arr2[j]

                if (union.isEmpty() || arr1[i]!=union.get(union.size()-1)){
                    union.add(arr1[i]);

                }
                i++;
                j++;
            }
        }


        while (i<arr1.length){

            if(union.isEmpty() || arr1[i]!=union.get(union.size()-1)){

                union.add(arr1[i]);
            }
            i++;

        }

        while (j<arr2.length){

            if(union.isEmpty() || arr2[j]!=union.get(union.size()-1)){

                union.add(arr2[j]);
            }
            j++;


        }

        return union;





    }
    public static void main(String[] args) {

        // union of 2 sorted arrays



        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5};

        Set<Integer> Ans=union(arr1,arr2);
        System.out.println(Ans);

        List<Integer> Answer=unionI(arr1,arr2);
        System.out.println(Answer);


    }
}
