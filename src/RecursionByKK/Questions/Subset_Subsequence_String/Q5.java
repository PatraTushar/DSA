package RecursionByKK.Questions.Subset_Subsequence_String;

public class Q5 {

    static void subsets(String ans,String str){

        if(str.isEmpty()){
            System.out.print(ans +" " );
            return ;
        }

        char ch=str.charAt(0);

       subsets( ans + ch , str.substring(1));
       subsets(ans,str.substring(1) );
    }

    public static void main(String[] args) {

        String str="abc";
        String ans="";
        subsets(ans,str);


    }
}
