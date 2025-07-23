package RecursionByStriver.Subset_Subsequence_String;

import java.util.ArrayList;

public class Q6 {

    static ArrayList<String> subsets(String ans, String str){

        if(str.isEmpty()){

            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;

        }

        char ch=str.charAt(0);

       ArrayList<String> left=  subsets( ans + ch , str.substring(1));
        ArrayList<String> right=  subsets(ans,str.substring(1));

        left.addAll(right);
        return left;
    }


    public static void main(String[] args) {

        String str="abc";
        String ans="";
       ArrayList<String> answer= subsets(ans,str);
        System.out.println(answer);
    }
}
