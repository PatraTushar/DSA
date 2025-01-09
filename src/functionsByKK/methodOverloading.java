package functionsByKK;

public class methodOverloading {

    static void fun(int a){

        System.out.println(a);

    }

    static void fun(String s){

        System.out.println(s);

    }

    static void overLoad(int a,String b){
        System.out.println(a + " " + b);
    }

    static void overLoad(String a,int b){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {

        fun(10);

        overLoad("Rahul",10);



    }
}
