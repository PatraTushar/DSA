import java.util.ArrayList;
import java.util.List;

public class myPractice {

    static ArrayList<Integer> helper(int[] arr, int index, int sum, ArrayList<Integer> list){

        if(index==arr.length){
            list.add(sum);
           // Collections.sort(list);
            return list;
        }

        helper(arr,index+1,sum,list);
        helper(arr,index+1,sum+arr[index],list);


        return list;

    }

    static ArrayList<Integer> subsetsum(int[] arr){

        return helper(arr,0,0,new ArrayList<>());
    }



    public static void main(String[] args) {




    }


}
