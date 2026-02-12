package OOPS.AccessModifier;

class access{
    private int num;     // private means you can only use inside the class not outside of the class/

   public String name;   // public means you can access everywhere

   int age;   // if it is default access modifier which will be access in the same package only
    int[] arr;

    access(int num,String name,int age){
        this.num=num;
        this.name=name;
        this.age=age;
        this.arr=new int[num];
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){

        this.num=num;
        System.out.println(" set to " +this.num);

    }
}

public class Main {

    public static void main(String[] args) {

        access obj=new access(10,"Kunal", 23);
        System.out.println(obj.getNum());
        obj.setNum(1000);

        String a=obj.name;
        System.out.println(a);
        System.out.println(obj.age);



    }

}
