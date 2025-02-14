package searchingKK;

public class squareRootUsingBinarySearch {

    static int squareRoot(int n){

        int start=1;
        int end=n;


        while(start<=end){

            int mid=start+(end-start)/2;



            if(mid * mid >n){
                end=mid-1;
            }

            else{
                start=mid+1;
            }
        }

        return end;


    }

    public static void main(String[] args) {

        int n=28;
        System.out.println(squareRoot(n));


    }
}
