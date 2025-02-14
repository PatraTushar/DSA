package STRINGS;

import java.util.*;

public class BASICS {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        String str=" college wallah ";
//        System.out.println(str);
//
//        String s=sc.nextLine();
//        System.out.println(s);

        //sc.next()--->ignore everything after space
        //sc.nextLine()--->print everything wheather there is space or not


        //  length() and charAt()
//        String str=" college wallah ";
//        System.out.println(str.length());
//        System.out.println(str.charAt(3));

        // indexOf()
//        String str="TUSHAR PATRA";
//        System.out.println(str.indexOf('P'));


        //compareTo()

//        String str="Hello";
//        String gtr="Mello";
//
//        System.out.println(str.compareTo(gtr));
//        System.out.println(gtr.compareTo(str));

        //contains()
//        String str="physics wallah";
//        System.out.println(str.contains("alla"));
//        System.out.println(str.contains("vfdkjn"));

        // startswith()
//        System.out.println(str.startsWith("phy"));
//        System.out.println(str.startsWith("wer"));

        // endswith()
//        System.out.println(str.endsWith("lah"));
//        System.out.println(str.endsWith("ert"));

        //toLowercase(),toUppercase(),Concat()

        //toLowercase()

//        String str="physics wallah ";
//        System.out.println(str.toLowerCase());

        //toUppercase()
//        System.out.println(str.toUpperCase());

        //concat()

//
//        String s1="abc";
//        String s2="def";
//        System.out.println(s1.concat(s2));



        // substring(i,j),substring(i)

//        String str="TUSHAR";
//        System.out.println(str.substring(0,4));
//        System.out.println(str.substring(1));


        // strings are immutable

//        String str="hello";
      //   str.charAt(0)='d';     we cant do this because strings are immutable



//        String str="hello";         //if i have to change it from hello-->heylo

        //2 index-->y

//        str=str.substring(0,2) + 'y' + str.substring(3);
//        System.out.println(str);


        //str.equals() and ==

        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

    }
}
