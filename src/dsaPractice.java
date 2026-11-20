import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dsaPractice {


    static int[] rearrangeElementsBySign(int[] nums) {


        int length = nums.length;
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        int[] res = new int[length];

        for (int ele : nums) {

            if (ele > 0) positives.add(ele);
            else negatives.add(ele);
        }


        int m = positives.size();
        int n = negatives.size();

        int i = 0;
        int j = 0;
        int k=0;

        while (i < m && j < n) {

            res[k++]=positives.get(i);
            res[k++]=negatives.get(j);

            i++;
            j++;


        }

        while (i<m){
            res[k++]=positives.get(i);
            i++;
        }

        while (j<n){
            res[k++]=negatives.get(j);
            j++;
        }

        return res;


    }

    public static void main(String[] args) {


        int[] arr = {3, 1, 2, -12, -5, -4};
        int[] Ans = rearrangeElementsBySign(arr);
        System.out.println(Arrays.toString(Ans));


    }

}


