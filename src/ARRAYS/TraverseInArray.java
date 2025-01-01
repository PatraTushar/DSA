package ARRAYS;
class AArrays{

     void traverse(){

         //1D arrays

        int[] arr=new int[3];

        arr[0]=64;
        arr[1]=684;
        arr[2]=649;

//        for(int i=0;i<3;i++){
//            System.out.println(arr[i]);
//        }

        // for each loop
        for(int age:arr){

            System.out.println(age);

        }

    }

}
public class TraverseInArray {

    public static void main(String[] args) {

   AArrays obj=new AArrays();
   obj.traverse();



    }
}
