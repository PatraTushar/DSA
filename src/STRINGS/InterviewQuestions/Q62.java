package STRINGS.InterviewQuestions;

public class Q62 {

    static int numberOfSubstrings(String s) {

        // Time Complexity: O(n²)
        // Space Complexity: O(1)

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            int zeroes = 0;
            int ones = 0;

            for (int j = i; j < n; j++) {

                if (s.charAt(j) == '0') zeroes++;
                else ones++;

                if (ones >= zeroes * zeroes) count++;

            }
        }

        return count;

    }

    static int numberOfSubstringsI(String s) {

        // Time Complexity: O(n^2)
        // Space Complexity: O(n)

        int n = s.length();
        int[] cumCountOne = new int[n];

        cumCountOne[0] = s.charAt(0) == '1' ? 1 : 0;

        for (int i = 1; i < n; i++) {

            cumCountOne[i] = cumCountOne[i - 1] + (s.charAt(i) == '1' ? 1 : 0);

        }

        int result = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int oneCount = cumCountOne[j] - (i > 0 ? cumCountOne[i - 1] : 0);
                int zeroCount = (j - i + 1) - oneCount;

                int z2 = zeroCount * zeroCount;

                if (oneCount < z2) {

                    int waste = z2 - oneCount;
                    j += waste - 1;

                } else if (oneCount == z2) result++;

                else {

                    result++;

                    int k=(int) Math.sqrt(oneCount)-zeroCount;
                    int next=j+k;

                    if (next>=n){
                        result+=(n-j-1);
                        break;
                    }

                    else result+=k;

                    j=next;

                }
            }
        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->3234

        String s = "00011";
        System.out.println(numberOfSubstrings(s));
        System.out.println(numberOfSubstringsI(s));
    }
}
