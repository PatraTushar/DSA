package ARRAYS.binarySearchPattern;

public class Q5 {

    static char smallestCharacter(char[] letters, char target) {

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int n = letters.length;

        int low = 0;
        int high = n - 1;
        char character=letters[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (letters[mid] <= target) low = mid + 1;

            else {

                character=letters[mid];
                high=mid-1;



            }
        }

        return character;



    }


    public static void main(String[] args) {

        // smallest letter(leeTCode->744)

        char[] ch = {'c', 'f', 'g'};
        char target = 'c';
        System.out.println(smallestCharacter(ch, target));
    }
}
