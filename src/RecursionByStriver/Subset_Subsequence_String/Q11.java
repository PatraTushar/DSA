package RecursionByStriver.Subset_Subsequence_String;

public class Q11 {

    static void permutation(String ans,String str){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);

        for(int i=0;i<ans.length()+1;i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
            permutation(f + ch + s,str.substring(1));
        }
    }

    public static void main(String[] args) {

        String str="abc";
        String ans="";
        permutation(ans,str);

    }
}
