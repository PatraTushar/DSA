package RecursionByKK.Questions.pattern_BubbleAndSelectionSort;

public class Q1 {

    static void pattern(int row,int column){

        if(row==0) return;

        if(column < row){
            System.out.print(" * ");
            pattern(row,column+1);
        }

        else {
            System.out.println();
            pattern(row-1,0);
        }


    }


    public static void main(String[] args) {

        pattern(4,0);


    }
}
