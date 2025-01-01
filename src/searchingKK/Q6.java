package searchingKK;

public class Q6 {

    // iterate through the array

    static int findNumbers(int arr[]){

        int count=0;
        for(int i=0;i< arr.length;i++){

            if(even(arr[i])){
                count++;
            }


        }

        return count;
    }

    // function to count the number of digits
     static int digit(int num){

        if(num<0){
            num=num*-1;
        }

        if(num==0){
            return 1;
        }

        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }

        return count;


     }

     // function to check whether a number contains even digit or not

    static boolean even(int num){

        int numberOfDigits=digit(num);

        if(numberOfDigits%2==0){
            return true;
        }

        return false;

    }





    public static void main(String[] args) {

        int nums[]={12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
}
