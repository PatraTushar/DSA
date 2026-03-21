public class myPractice {


    static char func(char[] letters, char target) {

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


        char[] ch = {'c', 'f', 'g'};
        char target = 'c';
        System.out.println(func(ch, target));


    }
}




