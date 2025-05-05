package ArraysbyKK.interviewQuestions;

public class Q26 {


    // BruteForce Method  (Method->1)
    static int sumOfRectangles(int[][] arr,int r1,int c1,int r2,int c2){

        int sum=0;

        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }

        return sum;

    }



    // Method-2 (Optimal approach)

    static int calculateSum(int[][] arr,int r1,int r2,int c1,int c2){

        if (r1 < 0 || r2 < 0 || c1 < 0 || c2 < 0) {
            throw new IllegalArgumentException("Negative indices are not allowed");
        }

        int row=arr.length;
        int column=arr[0].length;

        // prefixSum in rowWise

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

        // prefixSum In ColumnWise


            for(int j=0;j<column;j++) {
                for (int i = 1; i < row; i++) {
                    arr[i][j] += arr[i - 1][j];
                }
            }


       int  sum = arr[r2][c2];
        if (r1 > 0) sum -= arr[r1 - 1][c2];
        if (c1 > 0) sum -= arr[r2][c1 - 1];
        if (r1 > 0 && c1 > 0) sum += arr[r1 - 1][c1 - 1];

        return sum;







    }







    public static void main(String[] args) {

        // Q: sum of rectangles between the coordinates (pattern: prefix sum in 2D arrays)
        int[][] arr={{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1}};
        int r1=3;
        int r2=5;
        int c1=1;
        int c2=4;
        System.out.println(calculateSum(arr,r1,r2,c1,c2));



    }
}
