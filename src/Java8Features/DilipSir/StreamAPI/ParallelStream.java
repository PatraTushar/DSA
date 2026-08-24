package Java8Features.DilipSir.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class ParallelStream {

    static List<Employee> listOfEmployee() {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Rohan", "Hyderabad", 25, "Male", "IT", 2020, 60000));
        employeeList.add(new Employee(2, "Priya", "Bangalore", 28, "Female", "HR", 2018, 55000));
        employeeList.add(new Employee(3, "Rahul", "Chennai", 30, "Male", "Finance", 2016, 75000));
        employeeList.add(new Employee(4, "Sneha", "Hyderabad", 24, "Female", "IT", 2022, 50000));
        employeeList.add(new Employee(5, "Amit", "Pune", 32, "Male", "Sales", 2015, 80000));
        employeeList.add(new Employee(6, "Anjali", "Mumbai", 27, "Female", "Marketing", 2019, 65000));
        employeeList.add(new Employee(7, "Vikram", "Delhi", 35, "Male", "IT", 2012, 95000));
        employeeList.add(new Employee(8, "Neha", "Bangalore", 29, "Female", "Finance", 2017, 72000));
        employeeList.add(new Employee(9, "Karan", "Chennai", 26, "Male", "HR", 2021, 52000));
        employeeList.add(new Employee(10, "Pooja", "Pune", 31, "Female", "Sales", 2014, 85000));

        return employeeList;


    }


    public static void main(String[] args) {

        List<Employee> employees = listOfEmployee();

        // parallelStream()
        List<Employee> empDetails = employees.parallelStream().filter(e -> e.getYearOfJoining() > 2015).peek(System.out::println).toList();
        System.out.println(empDetails);


        // Methods of Collectors class


        // collect()
        // Req : collect all the employees names as a list whose age is greater than 25
        List<String> names = employees.stream().filter(e -> e.getAge() > 25).map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);


        // Req : unique department names
        Set<String> department = employees.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println(department);


        // Req : collect employee Id's and their salaries
        Map<Integer, Double> empIdsAndSalaries = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
        System.out.println(empIdsAndSalaries);


        //groupingBy()
        // Req : get average salary of each department
        Map<String, Double> avgSalaryDepartmentWise = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryDepartmentWise);


        // count()
        // Req : Get count of employees gender wise
        Map<String, Long> countOfEmpGenderWise = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countOfEmpGenderWise);


        // Req : summing all employees salaries
        System.out.println(employees.stream().collect(Collectors.summingDouble(Employee::getSalary)));
        System.out.println(employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));


        // maxBy()
        // Req : finding max age of employee
       Employee maxAge= employees.stream().collect(Collectors.maxBy((e1,e2)-> e1.getAge()-e2.getAge())).get();
        System.out.println(maxAge);


        // join()
        // Req : All departments names with delimiter :::
      String allDepartments=  employees.stream().map(Employee::getDepartment).collect(Collectors.joining(":::"));
        System.out.println(allDepartments);


    }
}
