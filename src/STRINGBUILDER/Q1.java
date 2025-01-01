package STRINGBUILDER;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {                 //PHYsics

            boolean flag = true;        //capital
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int ascii = (int) ch;                        //ch ra ascii value

            if (ascii >= 97) {
                flag = false;         //small
            }

            if (flag == true)
            {
                ascii = ascii + 32;
                char dh = (char) ascii;                //ascii re kau char achi
                str.setCharAt(i, dh);
            }

            else{
                ascii = ascii - 32;
                char dh = (char) ascii;
                str.setCharAt(i, dh);
            }


        }


        System.out.println(str);

    }
}
