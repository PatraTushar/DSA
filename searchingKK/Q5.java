package searchingKK;

public class Q5 {

    static int findMax(int arr[][]){

        int max=Integer.MIN_VALUE;

        for(int row=0;row<arr.length;row++){

            for(int  col=0;col<arr[row].length;col++){

                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }

        return max;

    }

    public static void main(String[] args) {

        int num[][]= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int ans=findMax(num);
        System.out.println(ans);

    }
}
