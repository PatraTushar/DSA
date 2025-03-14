package RecursionByKK.Questions.Subset_Subsequence_String;

public class Q21 {

    static void findAllIndices(int[] arr,int x,int i){

        if(i==arr.length) return;

        if(arr[i]==x){
            System.out.print(i +" ");
        }

         findAllIndices(arr,x,i+1);




    }



    public static void main(String[] args) {

        int[] arr={1,2,3,2,2,5};
        int x=2;
        findAllIndices(arr,x,0);



    }
}
