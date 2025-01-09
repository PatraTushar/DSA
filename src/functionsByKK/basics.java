package functionsByKK;

import java.lang.reflect.Array;
import java.util.Arrays;

public class basics {

    static void sum(int a,int b){

         a=100;              // creating a new object
         b=200;

         int sum=a+b;

        System.out.println(sum);

    }

    static void change(int num[]){

        num[0]=99;  // if you make a change to the object via reference variable,same object will be changed


    }

    public static void main(String[] args) {

        // in case of primitives (int,float,char,boolean ...)

        int p=20;
        int q=30;

        sum(p,q);

        System.out.println(p + " " +  q);


        // in case of non primitives (arr[],object ....)

        int arr[]={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));





    }
}
