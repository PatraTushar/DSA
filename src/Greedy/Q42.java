package Greedy;

public class Q42 {

    static int maxDiff(int num) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(n)

        String s = String.valueOf(num);
        int n = s.length();

        int firstMaxIdx = -1;
        int firstMinIdx = -1;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch != '9') {

                firstMaxIdx = i;
                break;
            }
        }


        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            if (ch != '1' && ch!='0') {

                firstMinIdx = i;
                break;
            }
        }

        char[] maxArr = s.toCharArray();


        if (firstMaxIdx != -1) {

            char target = s.charAt(firstMaxIdx);
            for (int i = 0; i < maxArr.length; i++) {


                if (maxArr[i] == target) maxArr[i] = '9';

            }


        }

        int maxValue = Integer.parseInt(new String(maxArr));     // new String(maxArr)-> ['9','9','9']->"999"    Integer.parseInt("999")->999


        char[] minArray = s.toCharArray();

        if (firstMinIdx != -1) {

            char target = s.charAt(firstMinIdx);
            char replacement = (firstMinIdx == 0) ? '1' : '0';

            for (int i = 0; i < minArray.length; i++) {


                if (minArray[i] == target) minArray[i] = replacement;
            }
        }


        int minValue = Integer.parseInt(new String(minArray));

        return maxValue - minValue;

    }

    public static void main(String[] args) {

        int num = 8763;
        int number=1125;
        System.out.println(maxDiff(num));
        System.out.println(maxDiff(number));

    }
}
