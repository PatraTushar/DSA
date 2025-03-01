package MathForDsa1ByKK;

public class Q7 {

    public static int findUnique(int[] arr) {
        int ones = 0, twos = 0, threes;

        for (int num : arr) {
            twos |= ones & num;  // Tracks bits appearing twice
            ones ^= num;         // Toggle bits using XOR
            threes = ones & twos; // Bits appearing three times

            ones &= ~threes;  // Remove 'threes' from 'ones'
            twos &= ~threes;  // Remove 'threes' from 'twos'
        }
        return ones;  // The unique number
    }



    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println("The number appearing once is: " + findUnique(arr));
    }
}
