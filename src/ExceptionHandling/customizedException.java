package ExceptionHandling;


class TooYoungException extends RuntimeException {

    TooYoungException(String s) {

        super(s);
    }
}


class TooOldException extends RuntimeException {

    TooOldException(String s) {

        super(s);
    }
}

public class customizedException {

    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        if (age > 60) {

            throw new TooYoungException(" Plz wait some more time you will get the best match ");
        } else if (age < 18) {

            throw new TooOldException(" Your age is already crossed marriage age no chance of getting marriage ");
        }

        else {

            System.out.println(" You will get match details soon by email.... ");
        }
    }
}
