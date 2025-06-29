package ArraysbyStriver.binarySearchPattern;

public class Q19 {

    static int squareRoot(int x){

        int start=1;
        int end=x;

        while (start<=end){

            int mid=start+(end-start)/2;
            long midSqr=(long)mid*mid;


            if(midSqr>x){
                end=mid-1;
            }

            else {
                start=mid+1;
            }
        }

        return end;
    }

    public static void main(String[] args) {

        int x=11;
        System.out.println(squareRoot(x));

    }

}
