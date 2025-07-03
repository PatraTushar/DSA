import java.util.NoSuchElementException;

public class myPractice {

  public  class Student{

    int rollNo;
     String name;

    static int population=100;

    public  void add(){

      System.out.println(" he adds ");


    }

  }
    public static void main(String[] args) {

    myPractice obj=new myPractice();
    myPractice.Student obj2=obj.new Student();
    obj2.add();











    }


}