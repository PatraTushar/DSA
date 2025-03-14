package RecursionByKK.Questions.Subset_Subsequence_String;

public class Q20 {

    static int searchingElement(int[] arr,int target,int i){

        if(i==arr.length) return -1;

        else if (arr[i]==target) return i;

        return searchingElement(arr,target,i+1);




    }

    public static void main(String[] args) {

        int[] arr={4,12,54,14,3,8,6,1};
        int target=8;
        int ans=searchingElement(arr,target,0);
        System.out.println(ans);

    }
}
