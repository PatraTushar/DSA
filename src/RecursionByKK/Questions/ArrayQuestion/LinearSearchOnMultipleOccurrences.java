package RecursionByKK.Questions.ArrayQuestion;

import java.util.ArrayList;

public class LinearSearchOnMultipleOccurrences {

  static ArrayList<Integer> list=new ArrayList<>();
    static void LS(int arr[],int target,int index){


        if(index==arr.length) return;

        else if (arr[index]==target) {
            list.add(index);

        }

        LS(arr,target,index+1);
    }

    public static void main(String[] args) {

        int arr[]={2,3,1,4,4,5};
        int target=4;
        LS(arr,target,0);
        System.out.println(list);
    }
}
