package CONSTRUCTOR;
import java.util.Scanner;
class Algebra{

    int a;
    int b;

    Algebra(int x,int y){
        System.out.println("constructor of algebra class called");
        a=x;
        b=y;
    }
    int add(){
        int ans=a + b;
        return ans;
    }

    int sub(){
        return a - b;
    }

    int mul(){
        return a * b;
    }
}

public class Constructor{

    public static void main(String[] args) {

        Algebra obj=new Algebra(5,7);
        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        int y=sc.nextInt();


        System.out.println("sum of number is");
        int ans=obj.add();
        System.out.println(ans);

        System.out.println(obj.sub());
        System.out.println(obj.mul());

    }
}

