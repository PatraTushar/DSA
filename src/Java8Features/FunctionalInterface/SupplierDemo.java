package Java8Features.FunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());

        // generate random otp
        Supplier<String> s2 = () -> {

            String otp = "";

            for (int i = 0; i < 6; i++) {

                otp = otp + (int)(Math.random() * 10);
            }

            return otp;
        };

        System.out.println(s2.get());
    }
}
