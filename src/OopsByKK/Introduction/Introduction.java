package OopsByKK.Introduction;

public class Introduction {

   static class Student{

        int rno;
        String name;
        double marks;

//        Student(){
//            this.rno=18;
//            this.name="Tushar";
//            this.marks=90.0;
//        }

        Student(int rno,String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }

        // call a constructor from another constructor
        Student(){
            this(19,"axar",99.9f);
        }


//       Student(Student otherName){
//
//            this.rno=otherName.rno;
//            this.name=otherName.name;
//            this.marks=otherName.marks;
//
//       }

        void greeting(){
            System.out.println(" hello my name is " +this.name);
        }

        void changeName(String name){
            this.name=name;
            System.out.println(" hello my name is " +this.name);

        }
    }

    public static void main(String[] args) {


//       Student s1=new Student(18,"Rohit",88.7f);
//        System.out.println(s1.rno);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);

//        s1.greeting();
//        s1.changeName("hacker");

//        Student s1=new Student(18,"Rohit",88.4f);
//        Student random=new Student(s1);
//        System.out.println(random.rno);
//        System.out.println(random.name);
//        System.out.println(random.marks);





//        Student s1=new Student();
//        System.out.println(s1.rno);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);
//
//        System.out.println();
//
//        s1.rno=12;
//        s1.name="Tushar";
//        s1.marks=90.0;
//
//        System.out.println(s1.rno);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);


        Student s1=new Student();
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student one =new Student();
        Student two=one;

        one.name="Something Something";
        System.out.println(two.name);



    }
}
