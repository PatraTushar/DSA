package JvmAndGarbageCollection;


public class TestC {

   public void finalize(){

       System.out.println(" finalize method called ");
   }

    public static void main(String[] args) {

       //TestC t=new TestC();
       // t=null;

       String s=new String(" durga ");
       s=null;

       System.gc();

        System.out.println(" end of main ");


    }
}


// In the above example string object eligible fir gc and hence string class finalize method got executed which has empty implementation and hence the output is " end of main "

// If we replace string object with TestC object then TesC finalize method will be executed. In this case the output is
// " end of main "                           |     " finalize method called "
// " finalize method called "                |      " end of main "