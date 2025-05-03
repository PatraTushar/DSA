package ArraysbyKK.interviewQuestions;

import java.util.HashSet;

public class Q3 {

    static int totalPairs(int[] arr,int target){  // bruteforce approach

        // Time Complexity (TC): O(n²)
        //Space Complexity (SC): O(1)

        int count=0;

        for(int i=0;i<arr.length-1;i++){

            int find=target-arr[i];

            for (int j=i+1;j<arr.length;j++){

                if(find==arr[j]) {
                    System.out.println(" pairs are : " +arr[i] + " " + arr[j]);
                    count++;

                }
            }


        }

        return count;
    }

    static int totalPairsI(int[] arr,int target){  // optimal solution

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)



        HashSet<Integer> set=new HashSet<>();
        int count=0;

        for(int ele:arr){

            int required=target-ele;

            if(set.contains(required)){
                System.out.println(ele +" "+ required);
                count++;

            }
            set.add(ele);
        }

        return count;


    }

    public static void main(String[] args) {

        // Q: find the total number of pairs in the array whose sum is equal to the given value x

        int[] arr={4,6,3,5,8,2};
        int target=7;
        System.out.println(" Total pairs : "+totalPairsI(arr,target));
    }
}
