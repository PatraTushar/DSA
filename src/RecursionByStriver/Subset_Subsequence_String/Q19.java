package RecursionByStriver.Subset_Subsequence_String;

public class Q19 {

    static int gcd(int x,int y){

        if (y==0) return x;

       return gcd(y,x%y);



    }

    public static void main(String[] args) {

        int ans=gcd(24,15);
        System.out.println(ans);


    }
}
