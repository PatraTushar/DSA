package strings.InterviewQuestions;

public class Q2 {

    static boolean checkIfPangram(String sentence){

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)    //For fixed-size structures (like int[26]), space complexity is considered O(1) — constant space

        int[] freq=new int[26];

        for(int i=0;i<sentence.length();i++){
            int ascii=sentence.charAt(i)-'a';
            freq[ascii]++;
        }

        for(int ele: freq){
            if(ele==0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String str="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));




    }
}
