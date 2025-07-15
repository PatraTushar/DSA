package RecursionByStriver.Questions.ArrayQuestion;

import java.util.ArrayList;

public class returnAnArrayList {

    static ArrayList<Integer> findAllIndexes(int[] arr,int target,int index,ArrayList<Integer> list){

        if(index==arr.length) return list;

        else if (arr[index]==target) {

            list.add(index);

        }

        return findAllIndexes(arr,target,index+1,list);
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,4,8};
        int target=4;
        ArrayList<Integer> ans=findAllIndexes(arr,target,0,new ArrayList<>());
        System.out.println(ans);
    }
}
