package searchingKK;

public class B3 {


    static char smallestLetter(char arr[],char target){

        int start=0,end=arr.length-1,N= arr.length;


        while(start<=end){

            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else{   // target > arr[mid]
                start=mid+1;
            }
        }


        return arr[start%N];


    }


    public static void main(String[] args) {


        char letters[]={'c','d','f','j'};
        char target='j';
        char ans=smallestLetter(letters,target);
        System.out.println(ans);

         char letters1[]={'c','f','j'};
        char target1='c';
        char ans1=smallestLetter(letters1,target1);
        System.out.println(ans1);

        char letters2[]={'x','x','y','y'};
        char target2='z';
        char ans2=smallestLetter(letters2,target2);
        System.out.println(ans2);






    }
}
