package RecursionByKK.Questions.Subset_Subsequence_String;

public class Q15 {

    static void diceCombination(String ans,int target){

        if(target==0){
            System.out.print(ans + " ");
            return;
        }

        for (int i=1;i<=6 && i<=target;i++){
            diceCombination(ans + i,target-i);
        }
    }

    public static void main(String[] args) {
        int target=4;
        diceCombination("",target);

    }
}
