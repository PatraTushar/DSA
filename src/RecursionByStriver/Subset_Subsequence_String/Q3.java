package RecursionByStriver.Subset_Subsequence_String;

public class Q3 {

    static String skipString(String str){

        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skipString(str.substring(5));
        }

        else {
            return str.charAt(0) + skipString(str.substring(1));
        }


    }

    public static void main(String[] args) {

        String str="bcdapplefg";
        String ans=skipString(str);
        System.out.println(ans);
    }
}
