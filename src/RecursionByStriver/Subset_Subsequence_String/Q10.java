package RecursionByStriver.Subset_Subsequence_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {

    static List<List<Integer>> subsetDuplicate(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            // if current and previous element is same
            if (i > 0  && arr[i]==arr[i - 1]){
                start=end+1;
            }

            else {
                start=0;
            }

            end=outer.size()-1;
            int n=outer.size();

            for(int j=start;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,3};
        List<List<Integer>> ans=subsetDuplicate(arr);
        System.out.println(ans);



    }
}
