package ArraysbyKK.strivers;

import java.util.ArrayList;
import java.util.Arrays;

public class Q14 {

    static int[] rearrange(int[] arr){

     //   Time Complexity: O(n)
       // Space Complexity: O(n)

        ArrayList<Integer> positives=new ArrayList<>();
        ArrayList<Integer> negatives=new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){
                positives.add(arr[i]);
            }

            else {
                negatives.add(arr[i]);
            }
        }

      if(positives.size()>negatives.size()){

          for(int i=0;i<negatives.size();i++){
              arr[2*i]=positives.get(i);
              arr[2*i+1]=negatives.get(i);
          }

          int index=negatives.size()*2;
          for(int i=negatives.size();i<positives.size();i++){
              arr[index]=positives.get(i);
              index++;
          }

      }

      else {

          for(int i=0;i<positives.size();i++){
              arr[2*i]=positives.get(i);
              arr[2*i+1]=negatives.get(i);
          }

          int index=positives.size()*2;
          for(int i=positives.size();i<negatives.size();i++){
              arr[index]=negatives.get(i);
              index++;
          }


      }

        return arr;
    }

    public static void main(String[] args) {

        // Rearrange array elements by sign but there is no equal number of positives and negatives

        int[] arr={-1,2,3,4,-3,1};
        int[] ans=rearrange(arr);
        System.out.println(Arrays.toString(ans));

    }
}
