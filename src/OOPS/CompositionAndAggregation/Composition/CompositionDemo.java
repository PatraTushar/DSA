package OOPS.CompositionAndAggregation.Composition;


class Department {

    String deptName;

    public Department(String deptName) {

        this.deptName = deptName;
    }

    void display() {
        System.out.println(" Department :" + deptName);
    }
}


class University {

    private Department department;

    public University() {

        department = new Department(" computer science ");
    }

    void display() {
        department.display();
    }
}

public class CompositionDemo {

    public static void main(String[] args) {

        University university=new University();
        university.display();

    }
}
