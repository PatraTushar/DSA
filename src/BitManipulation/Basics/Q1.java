package BitManipulation.Basics;

public class Q1 {

    static String decimalToBinary(int n) {

        //  Time Complexity:O((log n)²)
        //  Space Complexity: O(log n)


        String res = "";

        while (n > 0) {

            res = (n % 2) + res;
            n = n / 2;

        }


        return res;
    }


    static String decimalToBinaryI(int n) {

        //  Time Complexity:O(log n)
        //  Space Complexity: O(log n)


        StringBuilder sb = new StringBuilder();

        while (n > 0) {

            sb.append(n % 2);
            n = n / 2;
        }

        return sb.reverse().toString();


    }


    public static void main(String[] args) {

        // CONVERT DECIMAL TO BINARY

        int n = 7;
        System.out.println(decimalToBinary(n));
        System.out.println(decimalToBinary(13));
        System.out.println(decimalToBinaryI(13));


    }
}
