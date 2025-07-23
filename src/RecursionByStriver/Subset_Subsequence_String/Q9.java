package RecursionByStriver.Subset_Subsequence_String;

import java.util.ArrayList;
import java.util.List;

public class Q9 {

    static List<List<Integer>> subsets(int[] arr){

       List<List<Integer>> outer=new ArrayList<>();
       outer.add(new ArrayList<>());

        for(int num : arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }

        return outer;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3};
        List<List<Integer>> ans=subsets(arr);
        System.out.println(ans);



    }
}
