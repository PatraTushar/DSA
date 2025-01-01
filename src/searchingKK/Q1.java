package searchingKK;

public class Q1 {

    static boolean searchInString(String str,char target){

        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){

            if(target==str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str="Tushar";
        char target='h';

        System.out.println( searchInString(str,target));


    }
}
