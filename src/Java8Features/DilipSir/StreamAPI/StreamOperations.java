package Java8Features.DilipSir.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

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

        // Stream Methods/Operations


        // map()
        // Req : Get all employee name as a list
        List<String> employeeStream = employees.stream().map(emp -> emp.getName()).toList();
        System.out.println(employeeStream);


        // filter()
        // Req : Give employee names whose age > 25
        List<String> employeeNames = employees.stream().filter(emp -> emp.getAge() > 25)
                .map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(employeeNames);


        // distinct(),forEach()
        // distinct() → removes duplicates → keeps unique elements.
        // Req : Print all city names of employees
        employees.stream().map(emp -> emp.getCity()).distinct().forEach(System.out::println);


        // count()
        // Req : Get count of employees whose salary is > 60k
        long countOfEmployees = employees.stream().filter(emp -> emp.getSalary() > 60000).count();
        System.out.println(countOfEmployees);


        // limit()
        // Req : Get first 3 objects as a list
        List<Employee> first3Employees = employees.stream().limit(3).collect(Collectors.toList());
        System.out.println(first3Employees);


        // skip()
        // Req : skip first 3 employees and I want to collect other employees data
        List<Employee> empInfo = employees.stream().skip(5).collect(Collectors.toList());
        System.out.println(empInfo);


        // anyMatch()
        // Req : verify any emp <18
        boolean underAge = employees.stream().anyMatch(emp -> emp.getAge() < 18);
        System.out.println(underAge);


        // allMatch()
        // Req : check every employee join after 2010 or not
        boolean result = employees.stream().allMatch(emp -> emp.getYearOfJoining() > 2010);
        System.out.println(result);


        // noneMatch() :  anyone matching: false ,   no one matching:true
        // Req : Every employee salary under < 10000
        boolean res = employees.stream().noneMatch(emp -> emp.getSalary() < 10000);
        System.out.println(res);


        // findAny() :findAny() is a terminal operation that returns an Optional containing any one element of the stream. The element returned is not guaranteed.
        // Get one value out of all the values
        Employee emp = employees.stream().findAny().get();
        System.out.println(emp);

        // findFirst() : findFirst() returns the first element from the stream.
        // Req : Get the first employee object
        Employee firstEmployee = employees.stream().findFirst().get();
        System.out.println(firstEmployee);


        // sorted()
        // Req : Get Employee Id in sorting order
        List<Integer> sortedEmpID = employees.stream().map(e -> e.getId()).sorted().toList();
        System.out.println(sortedEmpID);

        // sorted(comparator)
        // Req : Sort the employees based on their ID in descending order using Java Stream API.”
        List<Employee> s = employees.stream().sorted((e1, e2) -> {

            return e2.getId() - e1.getId();
        }).toList();
        System.out.println(s);


        // min()
        // Req : Minimum salary employee details
        Employee minSalaryEmp = employees.stream().min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println(minSalaryEmp);


        // max()
        // Req : Maximum salary employee details
        Employee maxSalaryEmp = employees.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println(maxSalaryEmp);


        // average()
        // Req : average salary of employee
        // DoubleStream : stream contains only double value
        double avg = employees.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
        System.out.println(avg);


        // peek()
        // Req : out of all employees ,find whose date of joining >2015
        // Track How Many Employees Are Processed
        List<Employee> empDetails = employees.stream().filter(e -> e.getYearOfJoining() > 2020).peek(System.out::println).toList();
        System.out.println(empDetails);




    }
}


// Suppose your employees have salaries:
//
//Alice   → 50000
//Bob     → 30000
//Charlie → 40000
//David   → 25000
//
//The comparator calculates:
//
//1. Compare Alice and Bob
//e1.getSalary() - e2.getSalary()
//= 50000 - 30000
//= 20000
//
//Result is positive, so Bob is considered smaller.
//
//50000 > 30000
//       ↓
//Bob becomes current minimum
//2. Compare current minimum with Charlie
//30000 - 40000 = -10000
//
//Result is negative, so the first employee (30000) is smaller.
//
//30000 < 40000
//       ↓
//Bob remains minimum
//3. Compare current minimum with David
//30000 - 25000 = 5000
//
//Result is positive, so David is smaller.
//
//25000 < 30000
//       ↓
//David becomes minimum
//Finally:
//David → 25000
//So: min() returns the Employee object having the smallest salary.