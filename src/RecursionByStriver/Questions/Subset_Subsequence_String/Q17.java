package RecursionByStriver.Questions.Subset_Subsequence_String;

public class Q17 {

    static void kMultiples(int num,int k,int i){

        if(i==k+1){
            return;
        }

        System.out.print(num * i +" ");
        kMultiples(num,k,i+1);
    }

    public static void main(String[] args) {

        int num=12;
        int k=5;
        kMultiples(num,k,1);

    }
}
