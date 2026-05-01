package STRINGS.InterviewQuestions;

public class Q30 {


    static int numberOfBeams(String[] bank) {

        // Time Complexity: O(m*n)
        // Space Complexity: O(1)

        int n = bank.length;

        int prevDeviceCount = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {

            int currDeviceCount = 0;

            for (char ch : bank[i].toCharArray()) {

                if (ch == '1') currDeviceCount++;

            }

            result += (prevDeviceCount * currDeviceCount);

            prevDeviceCount = (currDeviceCount == 0) ? prevDeviceCount : currDeviceCount;
        }

        return result;
    }

    public static void main(String[] args) {

        // leeTCode->2125

        String[] bank = {"011001", "000000", "010100", "001000"};
        System.out.println(numberOfBeams(bank));


    }
}
