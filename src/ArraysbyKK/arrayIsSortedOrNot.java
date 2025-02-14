package ArraysbyKK;

public class arrayIsSortedOrNot {

    // sorted in ascending

    static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else {
                return false;
            }

        }

        return true;
    }

    // sorted in descending

    static boolean sorted(int arr[]){

        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){

            }

            else{
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,3,4,5,6,7};
        System.out.println(isSorted(arr));
        int num[]={9,8,7,7,6,5,4,3};
        System.out.println(sorted(num));
    }
}
