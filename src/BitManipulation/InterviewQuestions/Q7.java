package BitManipulation.InterviewQuestions;

public class Q7 {

    static int divide(int dividend,int divisor){


        int sum=0;
        int count=0;

        while (sum+divisor<=dividend){
            count++;
            sum+=divisor;
        }

        return count;
    }

    public static void main(String[] args) {

        int dividend=10;
        int divisor=3;
        System.out.println(divide(dividend,divisor));


    }
}
