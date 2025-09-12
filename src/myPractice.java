import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myPractice {


    static int[][] func(int n) {

        int[][] result = new int[n][];

        for (int i = 1; i < n; i++) {


            result[i] = new int[i + 1];
            result[i][0] = result[i][i] = 1;

            for (int j=1;j<i+1;j++){


            }


        }


    }


    public static void main(String[] args) {

        int r = 5;
        int c = 3;
        List<Integer> ans = func(6);
        System.out.println(ans);


    }

}











