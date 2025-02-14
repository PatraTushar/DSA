package OOPS;

public class Student {

     public String name;
     int rollNo;

    double percent;
    int numberOfStudents;

    public Student(){

    }



    public Student(String naam,int roll,double per){

        name=naam;
        rollNo=roll;
        percent=per;
        numberOfStudents++;

    }

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int roll){

        rollNo=roll;



    }




}
