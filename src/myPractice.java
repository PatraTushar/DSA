import java.util.Arrays;

public class myPractice {


    static int func(int[][] num, int r1, int c1, int r2, int c2) {

        int row = num.length;
        int col = num[0].length;

        for (int rowWise = 0; rowWise < row; rowWise++) {

            for (int columnWise = 1; columnWise < col; columnWise++) {

                num[rowWise][columnWise] += num[rowWise][columnWise - 1];


            }
        }

        for (int columnWise = 0; columnWise < col; columnWise++) {

            for (int rowWise = 1; rowWise < row; rowWise++) {

                num[rowWise][columnWise] += num[rowWise - 1][columnWise];


            }


        }


        int sum = num[r2][c2];

        if (r1 > 0) sum -= num[r1 - 1][c2];
        if (c1 > 0) sum -= num[r2][c1 - 1];
        if (r1>0 && c1>0) sum+=num[r1-1][c1-1];


        return sum;


    }


    public static void main(String[] args) {

        int[][] arr = {{1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}};
        int res = func(arr,3,1,5,4);
        System.out.println(res);


    }


}

