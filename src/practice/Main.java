package practice;


 class customArraylist{

     Object[] arr;
     int size;

     int capacity;

     public static final int DEFAULT_CAPACITY=10;

     customArraylist(){
         this.capacity=DEFAULT_CAPACITY;
         this.arr=new Object[capacity];
         this.size=0;

     }


    public void add(Object data){

         if(size==capacity){
             resize();
         }

         arr[size++]=data;


     }

     private void resize(){
         capacity*=2;
         Object[] newArr=new Object[capacity];

         for (int i=0;i<size;i++){
             newArr[i]=arr[i];
         }

         arr=newArr;
     }

     public void remove(int index){

         if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("Index out of bounds");
         }

         for (int i=index;i<size-1;i++){

             arr[i]=arr[i+1];

         }

         size--;

         if(size<capacity/4 && capacity>DEFAULT_CAPACITY){
             shrink();
         }

     }

     private void shrink(){
         capacity/=4;
         Object[] newArr=new Object[capacity];

         for (int i=0;i<size;i++){
             newArr[i]=arr[i];
         }
         arr=newArr;
     }



     public Object get(int index){

         if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("Index out of bounds");
         }

         return arr[index];


     }



     public void display(){

         for(int i=0;i<size;i++){
             System.out.print(arr[i]+" ");
         }
     }




}
public class Main {

    public static void main(String[] args) {

        customArraylist obj=new customArraylist();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.add(70);
        obj.add(80);
        obj.add(90);
        obj.add(100);
        obj.display();


    }
}
