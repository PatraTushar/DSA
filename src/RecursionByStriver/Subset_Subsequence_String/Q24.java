package RecursionByStriver.Subset_Subsequence_String;



public class Q24 {

    static void subsequenceSum(int arr[],int n,int index,int sum){

        if(index>=n){
            System.out.print(sum+" ");
            return;
        }

        //curr index + ans
        subsequenceSum(arr,n,index+1,sum + arr[index]);
        //curr ans

        subsequenceSum(arr,n,index+1,sum);
    }



    public static void main(String[] args) {

        int[] arr={2,4,5};

        subsequenceSum(arr,arr.length,0,0);


    }



    }



