package ArraysbyStriver.binarySearchPattern;

public class Q5 {

    static char smallestCharacter(char[] letters, char target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int n = letters.length;

        int low = 0;
        int high = n - 1;

        if (target > letters[n - 1] || target == letters[n - 1]) return letters[low];


        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target < letters[mid]) high = mid - 1;

            else low = mid + 1;
        }

        return letters[low];


    }


    public static void main(String[] args) {

        // smallest letter(leeTCode->744)

        char[] ch = {'c', 'f', 'g'};
        char target = 'c';
        System.out.println(smallestCharacter(ch, target));
    }
}
