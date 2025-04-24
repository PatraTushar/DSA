package ArraysbyKK.strivers;

public class Q28 {

    static int maximum1s(int[][] arr){ // brute force approach

        //Time Complexity: O(m * n)
        //Space Complexity: O(1)

        int max=-1;
        int rows=arr.length;
        int cols=arr[0].length;
        int index=-1;

        for(int i=0;i<rows;i++){

            int countRow=0;

            for (int j=0;j<cols;j++){
                countRow+=arr[i][j];

            }
            if(countRow>max){
                max=countRow;
                index=i;

            }

        }

        return index ;
    }

    static int findMaximum1sInTheRow(int[][] arr){

        //Time Complexity: O(m * log n)
        //Space Complexity: O(1)

        int rows=arr.length;
        int index=-1;
        int max=-1;

        for(int i=0;i<rows;i++){

            int max1s=findMAX1s(arr[i]);

            if(max1s>max){
                max=max1s;
                index=i;
            }
        }
        return index;
    }

    static int findMAX1s(int[] arr){

        int low=0;
        int high=arr.length-1;


        while (low<=high){

            int mid=low+(high-low)/2;

          if( (mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1 ){
              return arr.length-mid;

          }

          else if(arr[mid]==1) {
              high=mid-1;
          }

          else low=mid+1;
        }

        return 0;
    }

    public static void main(String[] args) {

        // Rows with maximum number of 1s

        int[][] arr={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
        System.out.println(maximum1s(arr));
        System.out.println(findMaximum1sInTheRow(arr));
    }
}
