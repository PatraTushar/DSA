public class myThread {

    static class Student {

       public void finalize(){

           System.out.println(" finalize method called ");


       }
    }


    public static void main(String[] args) {


      Student s=new Student();
      s.finalize();
      s.finalize();
       s=null;

       System.gc();

        System.out.println(" end of main ");


    }


}








