package SORTING;

import java.util.Scanner;

public class Q2 {

    static void sortFruits(String[] fruits){
        int n= fruits.length;

        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[min_idx])<0){

                    min_idx=j;

                }

            }


            String temp=fruits[i];
            fruits[i]=fruits[min_idx];
            fruits[min_idx]=temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String fruits[]={"papaya" , "lime","watermelon","apple","mango","kiwi"};

        sortFruits(fruits);

        for(int i=0;i< fruits.length;i++){
            System.out.println(fruits[i] +" ");
        }



    }

    }

