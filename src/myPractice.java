import java.util.*;

public class myPractice {

    static int func(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int longest = 0;

        for (int ele : nums) {

            set.add(ele);
        }


        for (int ele : set) {

            if (!set.contains(ele-1)){

                int curr=ele;
                int count=1;

                while (set.contains(curr+1)){

                    count++;
                    curr++;
                }

                longest=Math.max(count,longest);


            }

        }

        return longest;


    }

    public static void main(String[] args) {

        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(func(arr));

    }
}




