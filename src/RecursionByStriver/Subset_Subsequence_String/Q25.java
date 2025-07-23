package RecursionByStriver.Subset_Subsequence_String;

public class Q25 {

    static int best(int h[],int n,int index){

        if(index==n-1){
            return 0;
        }


        int option1= Math.abs(h[index]-h[index+1]) +best(h,n,index+1);


        if(index==n-2){
            return option1;
        }


        int option2= Math.abs(h[index]-h[index+2]) +best(h,n,index+2);

        int finalAns=Math.min(option1,option2);

        return finalAns;
    }



    public static void main(String[] args) {

        int h[]={10,30,40,20};

        int ans=best(h,h.length,0);
        System.out.println(ans);

    }
}
