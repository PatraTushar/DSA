package RecursionByKK.Questions.Level1question;

public class countZeroes {

//    static int count(int n){
//
//        int totalZeroes=0;
//
//        while (n>0){
//
//            if(n%10==0){
//                totalZeroes++;
//            }
//
//          n/=10;
//        }
//
//        return totalZeroes;
//
//    }


    static int countZeroesUsingRecursion(int n){
       return helper(n,0);

    }

    static int helper(int n,int count){

        if(n==0) return count;

        if(n%10==0){
            return helper(n/10,count+1);
        }

        return helper(n/10,count);



    }


    public static void main(String[] args) {

        int n=3040002;
        System.out.println(countZeroesUsingRecursion(n));


    }
}
