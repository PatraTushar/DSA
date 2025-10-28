import java.util.HashMap;
import java.util.Stack;

public class myPractice {

    static int func(int[] fruits) {

        int n = fruits.length;

        int maxFruits = 0;

        for (int i = 0; i < n; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int left = i;

            for (int j = i; j < n; j++) {


                map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

                while (map.size() > 2) {

                    map.put(fruits[left], map.get(fruits[left]) - 1);


                    if (map.get(fruits[left]) == 0) {

                        map.remove(fruits[left]);
                    }

                    left++;


                }

                maxFruits = Math.max(maxFruits, j - left + 1);


            }

        }

        return maxFruits;

    }

    public static void main(String[] args) {


        int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(func(arr));

    }


}

