import java.util.Arrays;
import java.util.Stack;

public class myPractice {

    static int largestRectangleHistogram(int[] arr){

        Stack<Integer> st=new Stack<>();
        int[] pse=new int[arr.length];
        int[] nse=new int[arr.length];

        for(int i=0;i<arr.length;i++){

            while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            pse[i]=st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for(int i=arr.length-1;i>=0;i--){

            while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            nse[i]=st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }

        int maxArea=0;
        int sum;

        for(int i=0;i<arr.length;i++){

            sum=arr[i]*(nse[i]-pse[i]-1);
            maxArea=Math.max(sum,maxArea);


        }

        return maxArea;

    }

    static int[][] pSum(char[][] arr){

        int rows=arr.length;
        int cols=arr[0].length;
        int[][] prefixSum=new int[rows][cols];

        for(int j=0;j<cols;j++){

            int sum=0;

            for (int i=0;i<rows;i++){

                if(arr[i][j]=='1') sum++;
                else sum=0;
                prefixSum[i][j]=sum;


            }
        }
        return prefixSum;
    }

    static int maximalRectangle(char[][] matrix){

        int[][] prefix=pSum(matrix);
        int rows=matrix.length;
        int MaxArea=0;

        for (int i=0;i<rows;i++){

            MaxArea=Math.max(MaxArea,largestRectangleHistogram(prefix[i]));




        }

        return MaxArea;



    }


    public static void main(String[] args) {

        char[][]  matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));






    }


}