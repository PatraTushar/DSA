package Java8Features.DilipSir.MethodReference.StaticMethodReference;

public class Employee {

    private int id;
    private String name;
    private String gender;
    private double salary;



    static boolean validateEmployeeDetails(Employee employee){

        if (employee.getId()!=0 && employee.getName()!=null) return true;
        return false;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
