package RecursionByStriver.Questions.Subset_Subsequence_String;

import java.util.ArrayList;

public class Q12 {

    static int permutationCount(String ans,String str){

        if(str.isEmpty()){
            return 1;
        }

        int count=0;

        char ch=str.charAt(0);

        for(int i=0;i<ans.length()+1;i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
             count=count + permutationCount(f + ch + s,str.substring(1));
        }

        return count;


    }

    static ArrayList<String> permutationList(String ans,String str){

        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch=str.charAt(0);

        ArrayList<String> answer=new ArrayList<>();

        for(int i=0;i<ans.length()+1;i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
           answer.addAll( permutationList(f + ch + s,str.substring(1)));
        }

        return answer;


    }

    public static void main(String[] args) {

        String str="abc";
        String ans="";
       ArrayList<String> finalAns= permutationList(ans,str);
        System.out.println(finalAns);
        int count=permutationCount(ans,str);
        System.out.println(count);




    }
}
