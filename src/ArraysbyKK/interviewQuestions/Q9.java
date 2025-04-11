package ArraysbyKK.interviewQuestions;

public class Q9 {

    static void swap(int a,int b){

        System.out.println(" before swapping " +a + " " + b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(" after swapping " +a + " " + b);
    }


    public static void main(String[] args) {

        int a=10;
        int b=20;
        swap(a,b);

    }
}
