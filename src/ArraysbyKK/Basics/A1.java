package ArraysbyKK.Basics;

public class A1 {

    static int countOccurrence(int[] arr,int x){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==x){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        // Q: count occurrences of x

        int[] arr={5,6,5,1,5};
        int x=5;
        System.out.println(countOccurrence(arr,x));
    }
}
