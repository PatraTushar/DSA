import java.util.Arrays;

public class myPractice {

    static void rotate(int[][] arr){

        int rows=arr.length;
        int cols=arr[0].length;

        for(int i=0;i<rows;i++){

            for(int j=i;j<cols;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }


        for(int i=0;i<rows;i++){

            int start=0;
            int end=cols-1;

            while (start<=end){

                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }


        }

        System.out.println(Arrays.deepToString(arr));
    }



    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);



    }


    }






