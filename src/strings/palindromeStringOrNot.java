package strings;

public class palindromeStringOrNot {

    static boolean palindrome(String str){

        if(str==null || str.length()==0){
            return true;
        }

        int start=0;
        int end=str.length()-1;


        while(start<=end){


            if(str.charAt(start)!=str.charAt(end)){

                return false;

            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str="abcdcba";
        System.out.println(palindrome(str));
    }
}
