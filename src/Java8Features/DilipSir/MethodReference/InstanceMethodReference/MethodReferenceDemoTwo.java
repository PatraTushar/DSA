package Java8Features.DilipSir.MethodReference.InstanceMethodReference;

public class MethodReferenceDemoTwo {

    public static void main(String[] args) {

        Employee e=new Employee();
        EmployeeValidation validEmployee= e::validateEmployeeDetails;

        Employee emp1=new Employee();
        validEmployee.isValidEmployee(emp1);

        Employee emp2=new Employee();
        emp2.setId(200);
        emp2.setName("mohan");
        validEmployee.isValidEmployee(emp2);


        // Access Instance Method With Class Name


        // Rule->The method which we are referring from any class (Employee) ,that method should not contain any method arguments
        // and the same method should contains same return value of abstract method which define inside functional interface

        // If the Rule satisfy then you can Access Instance Method With Class Name

        EmployeeValidation salaryValidation=Employee::validSalary;

        Employee emp3=new Employee();
        emp3.setSalary(20000);
        salaryValidation.isValidEmployee(emp3);


    }
}



