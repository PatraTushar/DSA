package DSAPractice;

public class Q25 {

    static char smallestCharacter(char[] letters, char target) {

        int n = letters.length;

        if (target < letters[0] || target >= letters[n - 1]) return letters[0];


        int low = 0;
        int high = n - 1;


        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target >= letters[mid]) {

                low = mid + 1;
            } else high = mid - 1;


        }

        return letters[low];
    }

    public static void main(String[] args) {


        char[] ch = {'c', 'f', 'g'};
        char target = 'c';
        System.out.println(smallestCharacter(ch, target));

    }
}
