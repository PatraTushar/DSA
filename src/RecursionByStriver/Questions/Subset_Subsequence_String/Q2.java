package RecursionByStriver.Questions.Subset_Subsequence_String;

public class Q2 {

    static String skip(String str){

        if(str.isEmpty()){
            return "";
        }

        char ch=str.charAt(0);

       if(ch!='a'){
          return ch + skip( str.substring(1));
       }

       else {
           return skip(str.substring(1));
       }
    }

    public static void main(String[] args) {

        String str="baccadh";
       String ans= skip(str);
        System.out.println(ans);
    }
}
