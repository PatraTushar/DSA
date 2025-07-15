import java.util.Arrays;

public class myPractice {


    public static class ArrayList<T> {

        T[] arr;
        int size;

        int capacity;

        public static final int DEFAULT_CAPACITY = 10;


        public ArrayList() {

            this.size = 0;
            this.capacity = DEFAULT_CAPACITY;
            this.arr =(T[]) new Object[capacity];
        }


        private void resize(){

            capacity*=2;
            T[] dynamicArr=(T[])new Object[capacity];

            for(int i=0;i<size;i++){

                dynamicArr[i]=arr[i];
            }

            arr=dynamicArr;


        }
        public void add(T val){

            if(size==capacity){

                resize();

            }
            arr[size++]=val;
        }


        public void remove(int idx){

            if(idx<0 || idx>=size){

                throw new IndexOutOfBoundsException(" invalid index ");

            }

            for(int i=idx;i<size-1;i++){
                arr[i]=arr[i+1];
            }

            size--;


            if(size<capacity/4 && capacity>DEFAULT_CAPACITY){
                shrink();
            }

        }

        private void shrink(){

            capacity/=2;
            T[] dynamicArray=(T[])new Object[capacity];

            for(int i=0;i<size;i++){

                dynamicArray[i]=arr[i];
            }

            arr=dynamicArray;
        }

        public T get(int idx){

            if(idx<0 || idx>=size){

                throw new IndexOutOfBoundsException(" invalid index ");

            }

            return arr[idx];
        }

        public int getSize(){

            return size==0 ? 0 : size;
        }

        public boolean isEmpty(){

            return size==0;
        }


        public void display(){

            for(int i=0;i<size;i++){

                System.out.print(arr[i] +" ");

            }
        }


    }


    public static void main(String[] args) {

        ArrayList<Integer> obj=new ArrayList<>();
        ArrayList<String> obj2=new ArrayList<>();


    }
}
