package ExceptionHandling;

import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        // 🔴 WITHOUT try-with-resources
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            System.out.print("Enter number (without try-with-resources): ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);

        } finally {
            if (sc != null) {
                sc.close(); // manual closing
            }
        }

        System.out.println("---------------------------");

        // 🟢 WITH try-with-resources
        try (Scanner sc2 = new Scanner(System.in)) {

            System.out.print("Enter number (with try-with-resources): ");
            int num2 = sc2.nextInt();
            System.out.println("You entered: " + num2);
        }
    }
}
