package Java8Features.DilipSir.MethodReference.StaticMethodReference;

import Java8Features.DilipSir.MethodReference.StaticMethodReference.Employee;
import Java8Features.DilipSir.MethodReference.StaticMethodReference.EmployeeValidation;

public class MethodReferenceDemoOne {

    public static void main(String[] args) {



        EmployeeValidation validEmployee= Employee::validateEmployeeDetails;

        Employee emp1=new Employee();
        System.out.println(validEmployee.isValidEmployee(emp1));

        Employee emp2=new Employee();
        emp2.setId(10);
        emp2.setName("raghav");
        System.out.println(validEmployee.isValidEmployee(emp2));

    }
}


// The method which is referred should be matched to method signature of  functional interface abstract method