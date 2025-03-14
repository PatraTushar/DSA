package RecursionByKK.Questions.Subset_Subsequence_String;

public class Q1 {

    static void skip(String str,String ans){

       if(str.isEmpty()){
           System.out.println(ans);
           return;
       }

       char ch=str.charAt(0);

       if(ch!='a'){
           skip(str.substring(1),ans + ch);
       }

       else {
           skip(str.substring(1),ans);
       }






    }

    public static void main(String[] args) {

        // skip a string

        String str="baccad";
        String ans="";

        skip(str,ans);
    }
}
