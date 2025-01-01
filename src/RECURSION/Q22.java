package RECURSION;

public class Q22 {

    static void printSubsequence(String str,String CurrAns){     //abc ,  " "


        if(str.length()==0){
            System.out.println(CurrAns);
            return ;
        }
        char curr=str.charAt(0);   //a
        String remString=str.substring(1);   //bc

        // curr char--> chooses to be a part of currAns

        printSubsequence(remString, CurrAns+curr);       //bc,"a"


        //curr char--> chooses not to be a part of currAns

        printSubsequence(remString,CurrAns);            //bc.""







    }

    public static void main(String[] args) {

        printSubsequence("abc","");



    }
}
