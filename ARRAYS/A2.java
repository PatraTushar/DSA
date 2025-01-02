
package ARRAYS;
class number{

    void Maximum(){

        int arr[]={1,5,3,8,6,13,122};
        int ans=0;

        for(int i=0;i< arr.length;i++){

            if(arr[i] > ans ){
                ans=arr[i];
            }


        }
        System.out.println(" maximum value is " +ans);


    }
}

public class A2 {


    public static void main(String[] args) {

         number obj=new number();
        obj.Maximum();

    }
}
