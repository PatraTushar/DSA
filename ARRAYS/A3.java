package ARRAYS;
class array{

    void searching(){

        int arr[]={1,3,5,7,8,9};

      int search=7;
      int ans=0;

        for(int i=0;i<arr.length;i++){


            if(arr[i]==search) {
                ans=i;
               // break;

            }



        }

        System.out.println(" found " +search+ " at index " +ans  );
    }
}
public class A3 {
    public static void main(String[] args) {

        array obj=new array();
        obj.searching();

    }
}
