package ArraysbyKK.interviewQuestions;

public class Q7 {

    static int firstRepeatingElement(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int x=arr[i];

            for(int j=i+1;j<arr.length;j++){
                if(x==arr[j]) return arr[j];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // Q:Given an array a consisting of integers return the first value that is repeating in this array if no value is being repeated return -1

        int[] arr={1,5,3,4,6,3,4};
        System.out.println(firstRepeatingElement(arr));
    }
}
