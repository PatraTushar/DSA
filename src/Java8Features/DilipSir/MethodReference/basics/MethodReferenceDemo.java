package Java8Features.DilipSir.MethodReference.basics;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        // using lambda

        upperCaseConversion toUpperCase = (val -> {

            System.out.println("Inside Lambda : Convert To Uppercase");
            return val.toUpperCase();
        });

        System.out.println(toUpperCase.convertToUppercase("java method references"));

        // using method reference

        upperCaseConversion upperCase = String::toUpperCase;
        System.out.println(upperCase.convertToUppercase("rahul"));
    }
}



// 1. What is a Method Reference?
//A method reference is a shorter way of writing a Lambda Expression when the required logic already exists inside a method.