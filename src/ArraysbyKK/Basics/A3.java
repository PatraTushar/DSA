package ArraysbyKK.Basics;

public class A3 {

    static int strictlyGreater(int[] arr,int x){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){

                count++;

            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Q: count the number of elements strictly greater than x

        int[] arr={5,6,5,1,5};
        int x=3;
        System.out.println(strictlyGreater(arr,x));
    }
}
