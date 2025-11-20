package Greedy;

public class Q51 {

    static int maxOperations(String s) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)

        int n = s.length();
        int count1seen = 0;
        int maxOperation = 0;
        int i = 0;

        while (i < n) {

            if (s.charAt(i) == '1') {

                count1seen++;
                i++;
            } else {

                maxOperation += count1seen;

                while (i < n && s.charAt(i) == '0') {

                    i++;


                }


            }

        }

        return maxOperation;


    }


    public static void main(String[] args) {

        // leeTCode->3228


        String s = "1001101";
        System.out.println(maxOperations(s));
    }
}
