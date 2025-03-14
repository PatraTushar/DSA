package RecursionByKK.Questions.pattern_BubbleAndSelectionSort;

public class Q2 {

    static void pattern(int rows,int column){

        if(rows==0) return;

        if(column < rows){
            pattern(rows,column+1);
            System.out.print("*");
        }
        else {
            pattern(rows-1,0);
            System.out.println();
        }


    }

    public static void main(String[] args) {

        pattern(4,0);


    }
}
