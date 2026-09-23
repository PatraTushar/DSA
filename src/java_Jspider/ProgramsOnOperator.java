package java_Jspider;

public class ProgramsOnOperator {

    static boolean isDivisibleBy5And7(int number) {

        return (number % 3 == 0) && (number % 7 == 0);
    }


    static String findGreatest(int num1, int num2) {

        return (num1 > num2) ? num1 + " is greater " : num2 + " is greater ";
    }


    static String findGreatestFrom3Numbers(int num1, int num2, int num3) {


        return (num1 > num2) ? ((num1 > num3) ? num1 + " is greater " : num3 + " is greater ") : ((num2 > num3) ? num2 + " is greater " : num3 + " is greater ");
    }


    static int findGreatestOf4Numbers(int a, int b, int c, int d) {


        return (a > b) ? ((a > c) ? ((a > d) ? a : d) : (c > d) ? c : d) : ((b > c) ? ((b > d) ? b : d) : (c > d) ? c : d);
    }


    public static void main(String[] args) {

        int number = 21;
        System.out.println(isDivisibleBy5And7(number));

        System.out.println(findGreatest(10, 20));

        System.out.println(findGreatestFrom3Numbers(45, 37, 100));

        int res = findGreatestOf4Numbers(10, 3, 20, 45);
        System.out.println(" The greatest of 4 numbers is " + res);


    }
}
