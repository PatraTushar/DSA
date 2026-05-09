package Java8Features;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeDetails {

    String name;
    String department;
    Integer salary;

    EmployeeDetails(String name, String department, Integer salary) {

        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    public String toString() {

        return name + ":" + department + ":" + salary;
    }
}

public class GroupingByDemo {

    public static void main(String[] args) {

        List<EmployeeDetails> employee = Arrays.asList(

                new EmployeeDetails("Alice", "HR", 3000),
                new EmployeeDetails("Bob", "IT", 4000),
                new EmployeeDetails("Charlie", "HR", 3500),
                new EmployeeDetails("Dave", "IT", 6500),
                new EmployeeDetails("Eve", "Finance", 5000)
        );


        Map<String, List<EmployeeDetails>> employeesByDepartment = employee.stream().collect(Collectors.groupingBy(EmployeeDetails::getDepartment));
        employeesByDepartment.forEach((department, employeeList) -> {
            System.out.println("Department" + department);
            employeeList.forEach(System.out::println);
        });

        System.out.println(" --------------------- ");


        Map<Boolean, List<EmployeeDetails>> partitionedBySalary = employee.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() > 5000));

        System.out.println(" Employee with salary >5000 ");
        partitionedBySalary.get(true).forEach(System.out::println);

        System.out.println(" Employee with salary <=5000 ");
        partitionedBySalary.get(false).forEach(System.out::println);


        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> min = number.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());


        Optional<Integer> first = number.stream().filter(i -> i % 2 == 0).findFirst();
        System.out.println(first.get());


        boolean b = number.stream().anyMatch(i -> i % 2 == 0);
        System.out.println(b);

        long c = number.stream().count();
        System.out.println(c);


        int sum = number.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }
}
