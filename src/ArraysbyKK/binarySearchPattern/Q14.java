package ArraysbyKK.binarySearchPattern;

public class Q14 {

    static int findMax(int[] arr){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    static int sumOfArr(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static int isPossible(int[] arr,int mid){

        int student=1;
        int StudentPages=0;


        for(int i=0;i<arr.length;i++){

            if(StudentPages+arr[i]<=mid){
                StudentPages+=arr[i];

            }
            else {
                student++;
                StudentPages=arr[i];
            }

        }
        return student;

    }

    static int bookAllocation(int[] arr,int Student){

        int start=findMax(arr);
        int end=sumOfArr(arr);



        while (start<=end){

            int mid=start+(end-start)/2;


            int numberOfStudents=isPossible(arr,mid);

            if (numberOfStudents>Student){
                start=mid+1;
            }
            else {
                end=mid-1;
            }



        }

        return start;




    }

    public static void main(String[] args) {

        // bookAllocation problem

        int[] arr={25,46,28,49,24};
        int Students=4;
        System.out.println(bookAllocation(arr,Students));




    }
}
