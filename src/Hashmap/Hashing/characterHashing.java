package Hashmap.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class characterHashing {

    static int[] charHash(String str){

        int[] hash=new int[26];

        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }

        return hash;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str="abcdabefc";
        int[] ans=charHash(str);
        System.out.println(Arrays.toString(ans));

        System.out.println(" enter queries");
        int q=sc.nextInt();

        while(q>0){

            char c=sc.next().charAt(0);
            System.out.println(" The character " + c + " occurs "+ans[c-'a'] + " times ");
            q--;
        }
    }
}
