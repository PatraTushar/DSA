package DSAPractice;

import java.util.ArrayList;
import java.util.List;

public class Q55 {

    static List<Integer> majorityElement2(int[] arr) {

        int n=arr.length;
        int ele1 = 0;
        int ele2 = 0;
        int count1 = 0;
        int count2 = 0;
        List<Integer> res=new ArrayList<>();

        for (int num : arr) {

            if (ele1 == num) {

                count1++;
            } else if (ele2 == num) {

                count2++;
            } else if (count1 == 0) {

                ele1 = num;
                count1++;
            } else if (count2 == 0) {

                ele2 = num;
                count2++;
            } else {

                count1--;
                count2--;
            }
        }


        count1 = 0;
        count2 = 0;

        for (int num : arr) {

            if (num == ele1) count1++;
            if (num == ele2) count2++;
        }

        int majority=n/3;

        if (count1>majority) res.add(ele1);
        if (count2>majority)res.add(ele2);

        return res;

    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> ans = majorityElement2(arr);
        System.out.println(ans);
    }
}
