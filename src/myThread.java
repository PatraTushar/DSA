public class myThread {

    static boolean checkPowOf2(long num) {

        long pow = 1;

        while (pow < num) {

            pow *= 2;

            if (pow == num) return true;
        }

        return false;
    }

    static long findNearestPower(long num) {

        long pow = 1;

        while (pow <= num) {

            pow = pow * 2;
        }

        return pow / 2;
    }

    static String counterGame(long n) {

        long count = 0;


        while (n > 1) {

            if (checkPowOf2(n)) {

                n = n / 2;

            } else {


                n -= findNearestPower(n);


            }

            count++;


        }


        return count % 2 == 1 ? "Louise" : "Richard";
    }


    public static void main(String[] args) {

    }
}


