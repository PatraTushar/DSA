package RecursionByStriver.Subset_Subsequence_String;

public class Q13 {

    static void pad(String ans,String str){

        if(str.isEmpty()){
            System.out.print(ans +" ");
            return;
        }

        int digit=str.charAt(0)-'0';  // convert '2' into 2
        String[] digitsToLetters={ "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // Get the corresponding letters for the current digit
        String letters = digitsToLetters[digit];

        for(int i=0;i<letters.length();i++){
            char ch=letters.charAt(i);
            pad(ans + ch,str.substring(1));
        }
    }

    public static void main(String[] args) {

        String str="23";
        String ans="";
        pad(ans,str);



    }
}
