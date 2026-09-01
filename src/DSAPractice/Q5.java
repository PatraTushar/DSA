package DSAPractice;

import java.util.HashSet;

public class Q5 {

    static int firstRepeatingElement(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int ele : arr) {

            if (set.contains(ele)){

                return ele;

            }

            set.add(ele);
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 6, 3, 4};
        System.out.println(firstRepeatingElement(arr));
    }
}
