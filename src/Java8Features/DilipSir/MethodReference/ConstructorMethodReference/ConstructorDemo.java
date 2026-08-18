package Java8Features.DilipSir.MethodReference.ConstructorMethodReference;

public class ConstructorDemo {

    public static void main(String[] args) {

        GetEmployeeInstance emp=Employee::new;
       Employee e1= emp.getEmployee(101,"VIRAT KOHLI");

        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
