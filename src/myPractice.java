import java.util.List;

public class myPractice {

    static List<Integer> findOccurrences(int[] arr,int target,int index,List<Integer> list){

        if(index==arr.length) return list;

        if(arr[index]==target) list.add(index);

        return findOccurrences(arr,target,index+1,list);
    }

    public static void main(String[] args) {


    }



}

