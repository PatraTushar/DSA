package RecursionByStriver.Questions.ArrayQuestion;

public class LinearSearchUsingRecursion {

    static int LsUsingRecursion(int arr[],int target,int index){

        if(index==arr.length) return -1;

        else if(arr[index]==target) return index;

        return LsUsingRecursion(arr,target,index+1);
    }

    public static void main(String[] args) {

        int arr[]={3,2,1,18,9};
        int target=18;
        System.out.println(LsUsingRecursion(arr,target,0));


    }
}
