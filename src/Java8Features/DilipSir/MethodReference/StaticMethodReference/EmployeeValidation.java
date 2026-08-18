package Java8Features.DilipSir.MethodReference.StaticMethodReference;

import Java8Features.DilipSir.MethodReference.StaticMethodReference.Employee;

@FunctionalInterface
public interface EmployeeValidation {

    boolean isValidEmployee(Employee employee);
}
