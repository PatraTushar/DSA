import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myPractice {


    static List<List<Integer>> func(int[] arr) {

        Arrays.sort(arr);


        int n = arr.length;

        List<List<Integer>> result = new ArrayList<>();

        int i = 0;

        while (i < n - 2) {


            int j = i + 1;
            int k = n - 1;

            while (j < k) {


                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {

                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(triplet);

                    int eleJ = arr[j];
                    int eleK = arr[k];

                    while (j < k && arr[j] == eleJ) j++;
                    while (j < k && arr[k] == eleK) k--;


                } else if (sum < 0) j++;

                else k--;


            }

            int eleI = arr[i];
            while (i < n - 2 && arr[i] == eleI) i++;
        }

        return result;


    }

    public static void main(String[] args) {

        int[] arr = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};
        List<List<Integer>> ans = func(arr);
        System.out.println(ans);


    }
}




