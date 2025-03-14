package RecursionByKK.Questions.Subset_Subsequence_String;



import java.util.ArrayList;
import java.util.List;

public class Q14 {

    static int padCount(String ans,String str){

        List<String> result = new ArrayList<>();

        if (str.isEmpty()) {
            return 1;
        }

        int count=0;

        int digit = str.charAt(0) - '0';  // convert '2' into 2
        String[] digitsToLetters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        // Get the corresponding letters for the current digit
        String letters = digitsToLetters[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            count=count +padCount(ans + ch, str.substring(1));
        }

        return count;

    }

    static List<String> pad(String ans, String str) {

        List<String> result = new ArrayList<>();

        if (str.isEmpty()) {
            result.add(ans);
            return result;
        }

        int digit = str.charAt(0) - '0';  // convert '2' into 2
        String[] digitsToLetters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        // Get the corresponding letters for the current digit
        String letters = digitsToLetters[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            result.addAll(pad(ans + ch, str.substring(1)));
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "23";
        String ans = "";
        List<String> result = pad(ans, str);
        System.out.println(result);  // Output the list of results
        int count=padCount(ans,str);
        System.out.println(count);
    }
}

