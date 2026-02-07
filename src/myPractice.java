
public class myPractice {


    static int func(int[] nums) {

        int unique=0;

        for (int ele : nums ){

            unique^=ele;
        }

        return unique;



    }


    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(func(arr));


    }


}

