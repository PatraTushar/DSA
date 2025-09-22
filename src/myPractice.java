import java.util.*;

public class myPractice {


    static List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        int i = 0;

        List<List<Integer>> result = new ArrayList<>();


        while (i < n - 2) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {

                    j++;
                } else if (sum > 0) {

                    k--;
                } else {

                    List<Integer> triplets = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(triplets);

                    int eleJ = arr[j];
                    int eleK = arr[k];

                    while (j < k && arr[j] == eleJ) j++;
                    while (j < k && arr[k] == eleK) k--;
                }
            }

            int eleI = arr[i];
            while (i < j && eleI == arr[i]) i++;


        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }


}








