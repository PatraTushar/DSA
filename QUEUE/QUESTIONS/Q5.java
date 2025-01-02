package QUEUE.QUESTIONS;

import java.util.*;

public class Q5 {

    public long[] printFirstNegativeNumber(long A[],int N,int K){




        long[] res=new long[N-K+1];
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<N;i++){

            if(A[i]<0){
                q.add(i);
            }
        }


        for(int i=0;i<N-K+1;i++){

            if(q.size()>0 && q.peek()<i) q.remove();

            if(q.size()>0 && q.peek()<=i+K-1 ){

                res[i]=A[q.peek()];
            }

            else if(q.size()==0) res[i]=0;

            else res[i]=0;

        }


        return res;






    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        Q5 obj = new Q5();
        long arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int N = arr.length;
        int K = 3;

        long[] result = obj.printFirstNegativeNumber(arr, N, K);

        System.out.println(Arrays.toString(result));









    }
}
