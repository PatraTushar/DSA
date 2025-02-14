package searchingKK;

public class linearSearch {

    static int Ls1(int arr[],int target){

        if(arr.length==0){
            return -1;

        }

        // search in the array : if item found return the index
        // if item nt found return -1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                return i;
            }



        }

        return -1;


    }

    static int Ls2(int arr[],int target){

        if(arr.length==0){
            return -1;
        }

        // search in the array : if item found return the element
        // if item nt found return -1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                return arr[i];
            }



        }

        return Integer.MIN_VALUE;


    }

    static boolean Ls3(int arr[],int target){

        if(arr.length==0){

            return false;

        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int nums[]={23,45,1,2,8,19,-3,16,-11,28};
        int target=45;

        int ans=Ls1(nums,target);
        System.out.println(ans);

        int answer=Ls2(nums,target);
        System.out.println(answer);

        boolean a=Ls3(nums,target);
        System.out.println(a);



        
    }
}
