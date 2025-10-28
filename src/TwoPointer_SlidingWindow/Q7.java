package TwoPointer_SlidingWindow;


import java.util.HashMap;
import java.util.HashSet;

public class Q7 {


    // BRUTE FORCE APPROACH
    static int totalFruits(int[] fruits) {

        //  Time Complexity: O(n^2)
        //  Space Complexity: O(3)


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

    // OPTIMAL APPROACH

    static int totalFruitsI(int[] fruits) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(2)

        int n = fruits.length;
        int maxFruits = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {


            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) map.remove(fruits[left]);

                left++;


            }

            maxFruits = Math.max(maxFruits, right - left + 1);


        }

        return maxFruits;


    }

    public static void main(String[] args) {

        // leeTCode->904

        int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(totalFruits(arr));
        System.out.println(totalFruitsI(arr));

    }
}
