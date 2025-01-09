package functionsByKK;

import java.util.Arrays;

public class VariableArguments {

    static void varArgs(int ...v){

        System.out.println(Arrays.toString(v));

    }

    static void multiple(int a,int b,String ...v){



    }



    public static void main(String[] args) {

        varArgs(1,2,3,4,5,6,7);
        multiple(10,20,"Kunal","Tushar");


    }
}
