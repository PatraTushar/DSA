package ARRAYS.strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {

    static List<Integer> Intersection(int[] arr1, int[] arr2) {

         // intersection of 2 sorted arrays with Duplicates

        //Time Complexity (TC): O(m + n)
        //Space Complexity (SC): O(min(n, m))

        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {

                i++;
            } else if (arr1[i] > arr2[j]) {

                j++;


            } else {


                result.add(arr1[i]);


                i++;
                j++;


            }
        }


        return result;

    }

    static ArrayList<Integer> IntersectionWithNoDuplicates(int[] arr1, int[] arr2) {

        // intersection of 2 sorted arrays without duplicates



        //Time Complexity (TC): O(m + n)
        //Space Complexity (SC): O(min(n, m))

        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {

                i++;
            } else if (arr1[i] > arr2[j]) {

                j++;


            } else {

                if (result.isEmpty() || arr1[i] != result.get(result.size() - 1)) {

                    result.add(arr1[i]);
                }

                i++;
                j++;


            }
        }


        return result;


    }


    static int intersect(int[] arr1,int[] arr2){

        // intersection of 2 unsorted arrays without duplicates

        //Time Complexity (TC): O(m log m + n log n)
        //Space Complexity (SC): O(min(n, m))


        int m=arr1.length;
        int n=arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> result = new ArrayList<>();


        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {

                i++;
            } else if (arr1[i] > arr2[j]) {

                j++;


            } else {

                if (result.isEmpty() || arr1[i] != result.get(result.size() - 1)) {

                    result.add(arr1[i]);
                }

                i++;
                j++;


            }
        }


        return result.size() ;





    }

    public static void main(String[] args) {



        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};

        List<Integer> Ans = Intersection(arr1, arr2);
        System.out.println(Ans);
        ArrayList<Integer> intersection = IntersectionWithNoDuplicates(arr1, arr2);
        System.out.println(intersection);


        int[] a={1,2,4,3,5,6};
        int[] b={3,4,5,6,7};

        System.out.println(intersect(a,b));

    }
}
