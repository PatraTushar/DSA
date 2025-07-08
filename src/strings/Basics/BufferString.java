package strings.Basics;


import java.text.DecimalFormat;
import java.util.Arrays;

public class BufferString {

    public static void main(String[] args) {

        // constructor 1

        StringBuffer sb = new StringBuffer();
        sb.append(" Hello world ");

        String str = sb.toString();
        System.out.println(str);

        // StringBuffer are mutable

        // constructor 2
        StringBuffer sb2 = new StringBuffer("kunal Kushwaha");

        // constructor 3
        StringBuilder sb3 = new StringBuilder(30);


        StringBuffer obj = new StringBuffer("Java");
        System.out.println(obj.length());  // 4
        System.out.println(obj.capacity());  // 20        (16 + 4)--- 16 is the Default capacity of StringBuffer and 4 is the length;


        StringBuffer ob = new StringBuffer("code");
        ob.append("with");  //  codewith
        //   System.out.println(ob);
        ob.append("Tushar"); // codewithTushar
        // System.out.println(ob);
        ob.insert(4, " ");      // code withTushar
        //  System.out.println(ob);
        ob.replace(9, 15, "GPT");  // code withGPT
        // System.out.println(ob);
        ob.delete(0, 2);        // de withGPT
        //   System.out.println(ob);
        ob.deleteCharAt(4);    // de wthGPT
        // System.out.println(ob);
        System.out.println(ob.charAt(7));  // P
        ob.setCharAt(5,'Q');
        System.out.println(ob);
      //  System.out.println(ob.reverse()); // TPGQtw ed



        // Remove whitespaces
        String sentence="I    LOVE     CODING";
        System.out.println(sentence.replaceAll(" ",""));

        // Split

        String names="Raj,Rahul,Rohan,Kunal";
        String[] arr=names.split(",");
        System.out.println(Arrays.toString(arr));

        // rounding off
        DecimalFormat dec=new DecimalFormat();
        System.out.println(dec.format(2.9999));


    }
}
