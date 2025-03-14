package RecursionByKK.Questions.ArrayQuestion;

public class arrayIsSortedOrNot {

    static boolean isSorted(int arr[],int index){



        if(index==arr.length-1) return true;

       return arr[index]<arr[index+1] && isSorted(arr,index+1);



    }

    public static void main(String[] args) {

        int arr[]={1,2,4,5};
        System.out.println(isSorted(arr,0));
    }
}
