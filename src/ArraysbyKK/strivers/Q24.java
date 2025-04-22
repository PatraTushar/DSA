package ArraysbyKK.strivers;

import java.util.Arrays;

public class Q24 {

    static void merge(int[] arr1, int m, int[] arr2, int n) {   // brute force approach

      //  Time Complexity: O(m + n)
      //  Space Complexity: O(m + n)

        int[] result=new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){

                result[k]=arr1[i];
                i++;



            }

            else{
                result[k]=arr2[j];
                j++;

            }

            k++;
        }



        while(i<m){
            result[k]=arr1[i];
            i++;
            k++;
        }

        while(j<n){
            result[k]=arr2[j];
            j++;
            k++;
        }

        for (int index = 0; index < m + n; index++) {
            arr1[index] = result[index];
        }

        System.out.println(Arrays.toString(arr1));



    }

    static void merge2SortedArrays(int[] arr1,int[] arr2,int m,int n){



      //  Time Complexity: O((m + n) log(m + n))
      //  Space Complexity: O(1)

        int left=arr1.length-1;
        int right=0;

        while (left>=0 && right<arr2.length){

            if(arr1[left]>=arr2[right]){
                swap(arr1,arr2,left,right);
                left--;
                right++;
            }

            else {
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }

    static void swap(int[] arr1,int[] arr2,int i,int j){

        int temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }

    public static void main(String[] args) {

        // merge sorted array (leeTCode->88)
        int[] arr1={1,2,3,0,0,0};
        int m=3;
        int[] arr2={2,5,6};
        int n=3;
        //merge(arr1,m,arr2,n);

        // optimal solution

        merge2SortedArrays(arr1,arr2,arr1.length,arr2.length);



    }
}
