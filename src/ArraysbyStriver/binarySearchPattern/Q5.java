package ArraysbyStriver.binarySearchPattern;

public class Q5 {

    static char smallestCharacter(char[] letters, char target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int n = letters.length;
        int start = 0;
        int end = letters.length - 1;
        char ans = 0;

        if (target > letters[n - 1] || target == letters[n - 1]) return letters[start];

        while (start <= end) {

            int mid = start + (end - start) / 2;


            if (letters[mid] > target) {

                ans = letters[mid];
                end = mid - 1;
            } else start = mid + 1;
        }


        return ans;

    }


    public static void main(String[] args) {

        // smallest letter(leeTCode->744)

        char[] ch = {'c', 'f', 'g'};
        char target = 'c';
        System.out.println(smallestCharacter(ch, target));
    }
}
