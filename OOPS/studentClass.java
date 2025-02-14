package OOPS;

public class studentClass {

//    public static class Student{                     //student
//
//        String name;
//        private int rollNo;
//
//        double percent;
//    }

//    public static void fun(Student s){
//        s.name="rahul";
//        s.rollNo=45;
//    }

    public static void main(String[] args) {


        Student s1=new Student();                    //object
        s1.name="Tushar";
       s1.rollNo=90;
        s1.percent=99.2;

        System.out.println(s1.name);   //object
        System.out.println(s1.rollNo);
        System.out.println(s1.percent);

        //getter and setter
//        System.out.println(s1.getRollNo());
//        s1.setRollNo(76);
//        System.out.println(s1.getRollNo());
//


//        System.out.println(s1.name);
//        System.out.println(s1.rollNo);
//       fun(s1);
//        System.out.println(s1.name);
//        System.out.println(s1.rollNo);




        Student s2=new Student("mehul",45,78.2);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.percent);


        Student s3=new Student("raghav",67,23.2);
        System.out.println(s3.numberOfStudents);

        Student s4=new Student("akash",23,77.2);
        System.out.println(s4.numberOfStudents);




    }
}
