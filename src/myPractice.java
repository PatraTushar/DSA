

public class myPractice {

    public static class math{

         void add(int a,int b){

             System.out.println(a+b);
         }
    }



    public static void main(String[] args) {

        math obj=new math(){

            void add(int a,int b){
                System.out.println(2*a+2*b);
            }
        };

        obj.add(2,3);


    }

}














