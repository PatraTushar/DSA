package RecursionByStriver.Questions.Backtracking;

public class Q1 {

    static int mazePaths(int sr,int sc,int er,int ec){


        // maze problem with 2 direction

        if(sr==er || sc==ec) return 1;


        int rightwards=mazePaths(sr,sc+1,er,ec);
        int downwards=mazePaths(sr+1,sc,er,ec);
        return rightwards + downwards;


    }

    public static void main(String[] args) {

        int rows=3;
        int columns=3;
        int count=mazePaths(1,1,rows,columns);
        System.out.println(count);


    }
}
