package DSAPractice;

public class Q44 {

    static int maxConsecutiveOnes(int[] arr) {

        int n = arr.length;
        int count = 0;
        int maxConsecutiveOnes = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) count++;

            else {

                maxConsecutiveOnes = Math.max(count, maxConsecutiveOnes);
                count = 0;

            }

        }

        maxConsecutiveOnes = Math.max(count, maxConsecutiveOnes);

        return maxConsecutiveOnes;

    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(arr));
    }
}
