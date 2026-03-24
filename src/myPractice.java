import java.util.Arrays;

public class myPractice {


    static int countCowPlaced(int[] stall, int distance) {

        int cows = 1;
        int lastPlacedPosition = stall[0];

        for (int i = 1; i < stall.length; i++) {

            if (stall[i]-lastPlacedPosition>=distance){

                cows++;
                lastPlacedPosition=stall[i];
            }
        }

        return cows;


    }

    static int AggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int n = stalls.length;

        int low = 0;
        int high = stalls[n - 1] - stalls[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int placedCows = countCowPlaced(stalls, mid);

            if (placedCows >= cows) low = mid + 1;

            else high = mid - 1;
        }

        return high;
    }


    public static void main(String[] args) {

        int[] arr = {0, 3, 4, 7, 10, 9};
        int cows = 4;
        System.out.println(AggressiveCows(arr, cows));


    }


}




