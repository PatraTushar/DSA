package java_Jspider;

public class breakAndContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);
            if (i == 3) break;

        }


        System.out.println("------------------------------------------------------");


        for (int i = 1; i <= 5; i++) {

            if (i == 2 || i == 3) continue;

            System.out.println(i);
        }
    }
}
