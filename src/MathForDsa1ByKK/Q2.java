package MathForDsa1ByKK;

public class Q2 {

    static int Ans(int arr[]){

        int unique=0;

        for(int n:arr){
            unique^=n;
        }

        return unique;
    }

    public static void main(String[] args) {

        int[] arr={2,3,4,1,2,1,3,6,4};
      //  int[] num={-2,3,2,4,-5,5,-4};
        System.out.println(Ans(arr));

    }
}
