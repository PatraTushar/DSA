package RecursionByStriver.Questions.Subset_Subsequence_String;

import java.util.ArrayList;
import java.util.List;

public class Q16 {

    static List<String> diceFace(String ans,int target,int face){

        List<String> list=new ArrayList<>();

        if(target==0){
            list.add(ans);
            return list;
        }

        for (int i=1;i<=face && i<=target;i++){
            list.addAll(diceFace(ans + i,target-i,face));
        }


        return list;


    }


    static List<String> diceList(String ans,int target){

        List<String> list=new ArrayList<>();

        if(target==0){
            list.add(ans);
            return list;
        }

        for (int i=1;i<=6 && i<=target;i++){
            list.addAll(diceList(ans + i,target-i));
        }


        return list;


    }

    public static void main(String[] args) {
        int target=4;
        List<String> ans=diceList("",target);
        System.out.println(ans);
        List<String> answer=diceFace("",target,3);
        System.out.println(answer);




    }
}
