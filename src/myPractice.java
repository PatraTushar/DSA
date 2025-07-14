import java.util.*;

public class myPractice {



    public static class Box<T>{


        static void print(){

            System.out.println(" it is a box ");
        }

        public  <T> T get(T NAME){

            return NAME;
        }



    }

    public static void main(String[] args) {

        Box<String> obj=new Box<>();
        System.out.println(obj.get("Rahul"));






    }
}
