package StackByStriver.interviewQuestions;

public class Q22 {

    static int minimumAddToMakeValid(String s) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int balance = 0;
        int insertion = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') balance++;

            else {

                if (balance > 0) balance--;
                else insertion++;
            }




        }

        return balance + insertion;


    }

    public static void main(String[] args) {

        String s = "())";
        System.out.println(minimumAddToMakeValid(s));


    }
}
