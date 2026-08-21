package Java8Features.DilipSir.FunctionalInterface.Predefined;

import java.util.Map;
import java.util.function.Predicate;

public class PredicateDemo {

    static class Employee {

        private int id;
        private String name;
        private double salary;
        private String gender;

        @Override
        public boolean equals(Object obj) {

            Employee emp = (Employee) obj;
            return this.getId()==emp.getId();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    public static void main(String[] args) {

        Predicate<Integer> ageCheck = age -> age > 18;
        System.out.println(ageCheck.test(13));
        System.out.println(ageCheck.test(25));

        if (ageCheck.test(45)) System.out.println("Eligible To Vote");
        else System.out.println("Not Eligible To Vote");


        // Employee Object :find out salary > 25000

        Employee e1 = new Employee();
        e1.setId(101);
        e1.setSalary(45000);
        e1.setGender("MALE");


        Employee e2 = new Employee();
        e2.setId(101);
        e2.setSalary(45000);
        e2.setGender("MALE");


        Predicate<Employee> empSalaryCheck = emp -> emp.salary > 25000;
        if (empSalaryCheck.test(e1)) System.out.println("Above 25000");
        else System.out.println("Below 25000");


        //  salary>25000 and Employee gender is MALE

        // equalsIgnoreCase() in Java compares two strings while ignoring uppercase/lowercase differences.
        // and() -> &&
        // or() -> ||
        // negate()-> !(negate() reverses the result of the Predicate)
        Predicate<Employee> maleCheck = emp -> emp.getGender().equalsIgnoreCase("male");
        System.out.println(empSalaryCheck.and(maleCheck).test(e1));
        System.out.println(empSalaryCheck.or(maleCheck).test(e1));
        System.out.println(empSalaryCheck.negate().test(e1));


        // Req: Employee : Have to validate other Employee
        // isEqual() -> isEqual() in Predicate is used to create a Predicate that checks whether the input is equal to a particular object.
        Predicate<Employee> baseEmp=Predicate.isEqual(e1);
        System.out.println(baseEmp.test(e2));


    }
}
