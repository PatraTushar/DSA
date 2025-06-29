package ArraysbyStriver.binarySearchPattern;

public class Q5 {

    static char smallestCharacter(char[] ch,char target){

        //Time Complexity (TC): O(log n)
        //Space Complexity (SC): O(1)

        int start=0;
        int end=ch.length-1;

        while (start<=end) {

            int mid = start + (end - start) / 2;

            if (target < ch[mid]) {

                end = mid - 1;

            } else {

                start = mid + 1;

            }
        }

        return ch[start%ch.length];

    }


    public static void main(String[] args) {

        // smallest letter(leeTCode->744)

        char[] ch={'c','f','g'};
        char target='c';
        System.out.println(smallestCharacter(ch,target));
    }
}
