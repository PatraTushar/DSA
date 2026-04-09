package ExceptionHandling;

import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {



        // 🟢 WITH try-with-resources
        try (Scanner sc2 = new Scanner(System.in)) {

            System.out.print("Enter number (with try-with-resources): ");
            int num2 = sc2.nextInt();
            System.out.println("You entered: " + num2);
        }
    }
}
