package RecursionByKK.Questions.Backtracking;

public class Q2 {

          // maze problem with 2 direction

    static void printPaths(String ans,int sr,int sc,int er,int ec){

        if(sr==er && sc==ec){
            System.out.println(ans);
            return;
        }

        if(sc<=ec){
            printPaths(ans+"R",sr,sc+1,er,ec);
        }

        if(sr<=ec){
            printPaths(ans+"D",sr+1,sc,er,ec);
        }



    }

    public static void main(String[] args) {

        int rows=3;
        int columns=3;
        printPaths("",1,1,rows,columns);

    }
}
