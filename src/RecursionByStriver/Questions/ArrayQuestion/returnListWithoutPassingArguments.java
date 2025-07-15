package RecursionByStriver.Questions.ArrayQuestion;

import java.util.ArrayList;

public class returnListWithoutPassingArguments {

    static ArrayList<Integer> findAllIndexes(int[] arr,int target,int index){

        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length) return list;

        // this will contain answer for that function calls only
        else if (arr[index]==target) {

            list.add(index);

        }

       ArrayList<Integer> ansFromBelowCalls= findAllIndexes(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;


    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,4,8};
        int target=4;
        System.out.println(findAllIndexes(arr,target,0));
    }
}
