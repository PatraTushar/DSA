package ArraysbyKK.interviewQuestions;

public class Q3 {

    static int totalPairs(int[] arr,int target){
        int count=0;

        for(int i=0;i<arr.length-1;i++){

            int find=target-arr[i];

            for (int j=i+1;j<arr.length;j++){

                if(find==arr[j]) {
                    System.out.println(" pairs are : " +arr[i] + " " + arr[j]);
                    count++;

                }
            }


        }

        return count;
    }

    public static void main(String[] args) {

        // Q: find the total number of pairs in the array whose sum is equal to the given value x

        int[] arr={4,6,3,5,8,2};
        int target=7;
        System.out.println(" Total pairs : "+totalPairs(arr,target));
    }
}
