import java.util.Arrays;

public class myPractice {


    static boolean func(int[] arr) {

        int n = arr.length;
        int prefix = 0;

        for (int i = 0; i < n; i++) {

            prefix += arr[i];


        }


        int suffix=0;

        for (int i=n-1;i>=0;i--){

            suffix+=arr[i];
            prefix-=arr[i];

            if (prefix==suffix) return true;
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 6, 3, 1};


    }


}

