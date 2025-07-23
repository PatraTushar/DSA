package RecursionByStriver.Subset_Subsequence_String;

public class Q18 {

    static int sumWithAlternativeSigns(int num,int ans,int i){

        if(i==num) return ans;

        if(i%2==0){
            return sumWithAlternativeSigns(num,ans+(i+1),i+1);
        }

        return sumWithAlternativeSigns(num,ans-(i+1),i+1);

    }

    public static void main(String[] args) {

       int ans= sumWithAlternativeSigns(10,1,1);
        System.out.println(ans);


    }
}
