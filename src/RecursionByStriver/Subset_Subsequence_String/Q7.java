package RecursionByStriver.Subset_Subsequence_String;

public class Q7 {

    static void ascii(String str,String ans){

        if(str.isEmpty()){
            System.out.print(ans +" ");
            return;
        }

        char ch=str.charAt(0);

        ascii(str.substring(1),ans + ch);
        ascii(str.substring(1),ans + (ch + 0));
        ascii(str.substring(1),ans);

    }

    public static void main(String[] args) {

        // how to find ascii of character
//      char ch='a';
//      System.out.println( ch + 0 );

        String str="abc";
        String ans="";
        ascii(str,ans);




    }
}
