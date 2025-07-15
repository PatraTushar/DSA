package RecursionByStriver.Questions.Subset_Subsequence_String;

import java.util.ArrayList;

public class Q8 {

    static ArrayList<String> ascii(String ans,String str){

        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch=str.charAt(0);

      ArrayList<String> first= ascii(ans+ch,str.substring(1));
      ArrayList<String> second=ascii(ans+(ch+0),str.substring(1));
       ArrayList<String> third=ascii(ans,str.substring(1));

       first.addAll(second);
       first.addAll(third);
       return first;


    }

    public static void main(String[] args) {

        String str="abc";
        String ans="";
        ArrayList<String> answer=ascii(ans,str);
        System.out.println(answer);
    }
}
