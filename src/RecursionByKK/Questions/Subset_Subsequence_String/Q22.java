package RecursionByKK.Questions.Subset_Subsequence_String;

public class Q22 {

    static boolean isPalindrome(String str,int start,int end){

        if(start>=end) return true;

        if(str.charAt(start)==str.charAt(end)){
           return isPalindrome(str,start+1,end-1);
        }

        else return false;




    }

    public static void main(String[] args) {
        String str="LEVEL";
        boolean ans=isPalindrome(str,0,str.length()-1);
        System.out.println(ans);

    }
}
