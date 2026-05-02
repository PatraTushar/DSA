package STRINGS.InterviewQuestions;

public class Q37 {

    static int compareVersion(String version1, String version2) {

        // Time Complexity: O(m+n)
        // Space Complexity: O(1)


        int m = version1.length();
        int n = version2.length();

        int i = 0;
        int j = 0;

        while (i < m || j < n) {

            int num1 = 0;
            int num2 = 0;

            while (i < m && version1.charAt(i) != '.') {

                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            while (j < n && version2.charAt(j) != '.') {

                num2 = num2 * 10 + (version2.charAt(j)-'0');
                j++;
            }


            if (num1 > num2) return 1;
            if (num1 < num2) return -1;

            i++;
            j++;

        }

        return 0;


    }


    public static void main(String[] args) {

        // leeTCode->165

        String version1 = "1.2";
        String version2 = "1.10";
        System.out.println(compareVersion(version1, version2));
    }
}
