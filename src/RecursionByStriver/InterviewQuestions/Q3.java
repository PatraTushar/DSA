package RecursionByStriver.InterviewQuestions;

public class Q3 {

    static String skipAppNotApple(String str){

        //  Time Complexity: O(n)
        // Space Complexity: O(n)

        if(str.isEmpty()) return "";

        char ch= str.charAt(0);

        if(str.startsWith("app") && !str.startsWith("apple")) return skipAppNotApple(str.substring(3));

        else return ch + skipAppNotApple(str.substring(1));
    }

    public static void main(String[] args) {

        String str="abcappledrf";
        String str2="abeapplrt";

        String ans=skipAppNotApple(str);
        System.out.println(ans);
        String ans1=skipAppNotApple(str2);
        System.out.println(ans1);


    }
}
