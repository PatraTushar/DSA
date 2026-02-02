public class myPractice {

    static int[] func(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= min) min = arr[i];

            if (arr[i] >= max) max = arr[i];


        }

        return new int[]{min, max};


    }


    public static void main(String[] args) {


    }


}

