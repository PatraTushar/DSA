package ArraysbyStriver.interviewQuestions;

public class Q8 {

    static void swap(int a,int b){

        //Time Complexity (TC): O(1)
        //Space Complexity (SC): O(1)

        System.out.println(" before swapping " +a + " " + b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println(" after swapping " +a + " " + b);


    }


    public static void main(String[] args) {

        // Q: swap using temporary variable

        int a=10;
        int b=20;

        swap(a,b);

    }
}
