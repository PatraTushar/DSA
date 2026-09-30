package java_Jspider;

public class Loops {

    public static void main(String[] args) {

        // ASSIGNMENTS

        // WHILE LOOP

        // PRINT 1 TO 5

        int num1 = 1;
        while (num1 <= 5) {

            System.out.println(num1++);
        }

        System.out.println("--------------------------------------------");

        // PRINT 5 TO 1

        int num2 = 5;

        while (num2 > 0) {
            System.out.println(num2--);
        }


        System.out.println("--------------------------------------------");


        int num3 = 1;

        while (num3 <= 5) {
            System.out.println("SQL");
            num3++;
        }

        System.out.println("--------------------------------------------");


        int number = 7;

        while (number <= 70) {

            System.out.println(number);
            number += 7;

        }


        System.out.println("--------------------------------------------");


        char ch = 'A';

        while (ch <= 'Z') {
            System.out.println(ch + " ");
            ch++;
        }


        System.out.println("--------------------------------------------");


        char c = 'z';
        while (c >= 'a') {
            System.out.println(c + " ");
            c--;
        }


        System.out.println("--------------------------------------------");


        char uppercase = 'A';
        char lowercase = 'a';

        while (uppercase <= 'Z' && lowercase <= 'z') {

            System.out.println(uppercase + "" + lowercase);
            uppercase++;
            lowercase++;
        }


        System.out.println("--------------------------------------------");


        char uc = 'Z';
        char lc = 'a';

        while (uc >= 'A' && lc <= 'z') {

            System.out.println(uc + "|" + lc);
            uc--;
            lc++;
        }


        System.out.println("--------------------------------------------");


        char UC = 'A';
        char LC = 'z';
        int num = 1;

        while (UC <= 'Z' && LC >= 'a') {

            System.out.println(UC + "" + num + LC);
            UC++;
            LC--;
            num++;
        }


        System.out.println("--------------------------------------------");


        char c1 = 'a';
        while (c1 <= 'z') {

            System.out.println(c1 + "" + (char) (c1 - 32));
            c1++;
        }


        System.out.println("--------------------------------------------");




        // FOR LOOP

        // PRINT 1 TO 5

        for (int num4 = 1; num4 <= 5; num4++) {
            System.out.println(num4);
        }

        System.out.println("--------------------------------------------");

          // PRINT 5 TO 1

        for (int num5 = 5; num5 > 0; num5--) {
            System.out.println(num5);
        }

        System.out.println("--------------------------------------------");

        // PRINT SQL 5 TIMES

        for (int num6 = 1; num6 <= 5; num6++) {
            System.out.println("SQL");
        }

        System.out.println("--------------------------------------------");

         // PRINT MULTIPLES OF 7 FROM 7 TO 70

        for (int number1 = 7; number1 <= 70; number1 += 7) {
            System.out.println(number1);
        }

        System.out.println("--------------------------------------------");

        // PRINT UPPERCASE LETTERS A TO Z

        for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
            System.out.println(ch1 + " ");
        }

        System.out.println("--------------------------------------------");

        // PRINT LOWERCASE LETTERS z TO a

        for (char ch2 = 'z'; ch2 >= 'a'; ch2--) {
            System.out.println(ch2 + " ");
        }

        System.out.println("--------------------------------------------");

          // PRINT Aa TO Zz

        for (char uppercase1 = 'A', lowercase1 = 'a'; uppercase1 <= 'Z' && lowercase1 <= 'z'; uppercase1++, lowercase1++) {

            System.out.println(uppercase1 + "" + lowercase1);
        }

        System.out.println("--------------------------------------------");

         // PRINT Z|a TO A|z

        for (char uc1 = 'Z', lc1 = 'a'; uc1 >= 'A' && lc1 <= 'z'; uc1--, lc1++) {

            System.out.println(uc1 + "|" + lc1);
        }

        System.out.println("--------------------------------------------");

          // PRINT A1z TO Z26a

        for (char UC1 = 'A', LC1 = 'z', num7 = 1;
             UC1 <= 'Z' && LC1 >= 'a';
             UC1++, LC1--) {

            System.out.println(UC1 + "" + (UC1 - 'A' + 1) + LC1);
        }

        System.out.println("--------------------------------------------");

         // PRINT aA TO zZ

        for (char c3 = 'a'; c3 <= 'z'; c3++) {
            System.out.println(c3 + "" + (char) (c3 - 32));
        }


        System.out.println("--------------------------------------------");


        // DO WHILE LOOP


        // 1. PRINT LOWERCASE LETTERS z TO a

        char ch3 = 'z';

        do {
            System.out.println(ch3 + " ");
            ch3--;
        } while (ch3 >= 'a');

        System.out.println("--------------------------------------------");

        // 2. PRINT Aa TO Zz

        char uppercase2 = 'A';
        char lowercase2 = 'a';

        do {
            System.out.println(uppercase2 + "" + lowercase2);
            uppercase2++;
            lowercase2++;
        } while (uppercase2 <= 'Z' && lowercase2 <= 'z');

        System.out.println("--------------------------------------------");

        // 3. PRINT Z|a TO A|z

        char uc2 = 'Z';
        char lc2 = 'a';

        do {
            System.out.println(uc2 + "|" + lc2);
            uc2--;
            lc2++;
        } while (uc2 >= 'A' && lc2 <= 'z');

        System.out.println("--------------------------------------------");

         // 4. PRINT A1z TO Z26a

        char UC2 = 'A';
        char LC2 = 'z';
        int num8 = 1;

        do {
            System.out.println(UC2 + "" + num8 + LC2);
            UC2++;
            LC2--;
            num8++;
        } while (UC2 <= 'Z' && LC2 >= 'a');

        System.out.println("--------------------------------------------");

          // 5. PRINT aA TO zZ

        char c4 = 'a';

        do {
            System.out.println(c4 + "" + (char) (c4 - 32));
            c4++;
        } while (c4 <= 'z');


    }
}
