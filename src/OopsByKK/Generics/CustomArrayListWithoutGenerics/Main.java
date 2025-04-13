package OopsByKK.Generics.CustomArrayListWithoutGenerics;

import java.util.Arrays;

class customArrayList{
   private Object[] arr;
   private int size=0;

   customArrayList(int capacity){

       this.arr=new Object[capacity];
   }

   public void add(Object element){

       if(size==arr.length){
           throw new RuntimeException(" Array is full ");
       }

       arr[size++]=element;
   }

   public Object get(int index){
       if(index<0 || index>=size){
           throw new IndexOutOfBoundsException(" index out of range ");
       }

       return arr[index];
   }

   public Object getSize(){

       return size;
   }

   public void print(){

       for(int i=0;i<size;i++){
           System.out.print(arr[i] +" ");
       }
       System.out.println();
   }



}
public class Main {

    public static void main(String[] args) {

        customArrayList obj=new customArrayList(5);

        Object val=obj.get(0);
        int square= (Integer)val*(Integer) val;  // this is the reason we use generics
        obj.add(10);
        obj.add("rahul");
        obj.print();
        int a=(int)obj.get(0);
        System.out.println(a);
//        int b=(int)obj.get(1);  //error
//        System.out.println(b);



    }
}
