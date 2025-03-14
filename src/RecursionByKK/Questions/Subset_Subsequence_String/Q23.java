package RecursionByKK.Questions.Subset_Subsequence_String;

public class Q23 {



    static String reverse(String str, int index){

    if(index==str.length()) return "";

    return reverse(str,index+1) +str.charAt(index);



    }

    public static void main(String[] args) {

        String str="abcdef";
       String ans=reverse(str,0);
        System.out.println(ans);



    }
}
