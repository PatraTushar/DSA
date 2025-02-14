package ARRAYS;
  class maths{

   static  void sum(){
        int arr[]={1,5,3};
        int sum=0;

        for (int i=0;i<3;i++){
            sum=sum + arr[i];

        }
       System.out.println(sum);
    }

}
public class A1 {

    public static void main(String[] args) {

      maths obj=new maths();
      obj.sum();


    }
}
