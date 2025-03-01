package MathForDsa1ByKK;

public class Q1 {

    static boolean isEven(int n){

      return ((n&1)==0);


    }

    public static void main(String[] args) {

        int n=201;
        if(isEven(n)){
            System.out.println(" even ");
        }
        else {
            System.out.println(" odd ");
        }



    }
}
