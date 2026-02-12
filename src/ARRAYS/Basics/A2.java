package ARRAYS.Basics;

public class A2 {

    static int lastOccurrence(int[] arr,int x){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int lastOcc=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastOcc=i;
            }
        }

        return lastOcc;
    }

    public static void main(String[] args) {

        // Q: last occurrence of element x

        int[] arr={5,6,5,3,5,4};
        int x=5;
        System.out.println(lastOccurrence(arr,x));
    }
}
