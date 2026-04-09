import java.util.Scanner;

public class myThread {



    public static void main(String[] args)  {

        // try without resources

        Scanner sc=null;

        try {


            sc=new Scanner(System.in);
            System.out.println(" enter the number  ");
            int num=sc.nextInt();
            System.out.println(" Number :" +num);
        }

        finally {

            if (sc!=null){

                sc.close();
            }
        }




    }


}








