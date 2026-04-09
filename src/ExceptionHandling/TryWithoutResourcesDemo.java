package ExceptionHandling;

import java.util.Scanner;

public class TryWithoutResourcesDemo {

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


    }
}
