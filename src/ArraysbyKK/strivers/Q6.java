package ArraysbyKK.strivers;

public class Q6 {

    static int maxConsecutiveOnes(int[] arr){

        int max=0;
        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                count++;

            }
            else {
               max=Math.max(max,count);
                count=0;
            }

        }

        max=Math.max(max,count);
        return max;
    }

    public static void main(String[] args) {

        // maximum consecutive ones


        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(arr));

    }
}
