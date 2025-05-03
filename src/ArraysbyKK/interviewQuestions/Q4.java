package ArraysbyKK.interviewQuestions;

import java.util.HashSet;

public class Q4 {

    static int totalTripletPairs(int[] arr,int target){ // bruteforce

        //Time Complexity (TC): O(n³)
        //Space Complexity (SC): O(1)
        int n=arr.length;

        int count=0;

        for(int i=0;i<n-2;i++){

            for(int j=i+1;j<n-1;j++){

                int find=target-(arr[i]+arr[j]);

                for (int k=j+1;k<n;k++){
                    if(find==arr[k]){
                        System.out.println(" pairs are : " +arr[i] + " " + arr[j] + " "+ arr[k]);
                        count++;
                    }
                }
            }
        }

        return count;
    }


    static int totalTripletPairsI(int[] arr,int target){  // optimal

     //   Time Complexity (TC): O(n²)
     //   Space Complexity (SC): O(n)


        HashSet<Integer> set=new HashSet<>();
        int count=0;

      for(int i=0;i<arr.length-1;i++){

          for(int j=i+1;j<arr.length;j++){

              int required=target-(arr[i]+arr[j]);

              if(set.contains(required)){
                  System.out.println(required+" "+arr[i] +" "+ arr[j]  );
                  count++;
              }

          }

          set.add(arr[i]);


      }

      return count;
    }

    public static void main(String[] args) {



        // Q: count the number of triplets whose sum is equal to  the given value

        int[] arr={1,4,5,6,3};
        int target=12;
        System.out.println(" total pairs " +totalTripletPairsI(arr,target));




    }
}
