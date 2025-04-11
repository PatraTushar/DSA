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

    static void findPrefixSumOfArr(int[][] arr){

        int row=arr.length;
        int column=arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=1;j<column;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }


    // Method->2
    static int SumOfRec(int[][] arr,int r1,int c1,int r2,int c2){

        int sum=0;
        findPrefixSumOfArr(arr);

        for (int i=r1;i<=r2;i++){

            if(c1>=1){
                sum+=arr[i][c2]-arr[i][c1-1];

            }

            else {
                sum+=arr[i][c2];
            }

        }



        return sum;


    }

    // Method-3 (Optimal approach)

    static int find(int[][] arr,int r1,int c1,int r2,int c2){
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

        int sum;

        sum = arr[r2][c2];
        if (r1 > 0) sum -= arr[r1 - 1][c2];
        if (c1 > 0) sum -= arr[r2][c1 - 1];
        if (r1 > 0 && c1 > 0) sum += arr[r1 - 1][c1 - 1];

        return sum;







    }







    public static void main(String[] args) {

        // Q: sum of rectangles between the coordinates (pattern: prefix sum in 2D arrays)
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(sumOfRectangles(arr,1,1,2,2));
//        System.out.println(SumOfRec(arr,1,1,2,2));
        System.out.println(find(arr,1,1,2,2));


    }
}
