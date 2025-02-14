package SORTING;

import java.util.Scanner;

public class B2 {

    static int sqrt(int x){
        int start=0,end=x;
        int ans=-1;

        while(start<=end){

            int mid=start + (end-start)/2;
            int value=mid*mid;

            if(value==x){
                return mid;
            }

            else if(value>x){
                end=mid-1;
            }

            else{
                start=mid+1;
                ans=mid;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println(" enter x ");
        int x=sc.nextInt();

        int finalAns=sqrt(x);
        System.out.println(finalAns);
    }
}
