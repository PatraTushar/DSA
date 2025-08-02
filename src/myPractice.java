import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class myPractice {


    public static class ArrayList<T> {

        T[] arr;

        int size;

        int capacity;

        public static final int DEFAULT_CAPACITY = 10;

        ArrayList() {

            this.size = 0;
            this.capacity = DEFAULT_CAPACITY;
            this.arr = (T[]) new Object[capacity];
        }


        private void resize() {

            capacity*=2;
            T[] newArr=(T[]) new Object[capacity];

            for(int i=0;i<size;i++){

                newArr[i]=arr[i];
            }

            arr=newArr;


        }


        public void add(T val) {

            if (size == capacity) {

                resize();
            }

            arr[size++] = val;


        }

        public void remove(int index) {

            if (index < 0 || index >=size) {

                throw new IndexOutOfBoundsException(" Not a valid index ");

            }



            for(int i=index;i<size-1;i++){

                arr[i]=arr[i+1];
            }


          size--;


            if(size<capacity/4 && capacity>DEFAULT_CAPACITY){

                shrink();
            }


        }

        private void shrink(){

            capacity/=2;

            T[] newArr=(T[]) new Object[capacity];

            for(int i=0;i<size;i++){

                newArr[i]=arr[i];
            }

            arr=newArr;
        }

        public Object get(int index){

            if (index < 0 || index >=size) {

                throw new IndexOutOfBoundsException(" Not a valid index ");

            }

            return arr[index];


        }


        public int getSize() {
            return size;
        }

        public boolean isEmpty(){

            if(size<=0) return true;

            return false;
        }

        public String toString(){

            StringBuilder str=new StringBuilder();

            str.append("[");

            for(int i=0;i<size;i++){

                str.append(arr[i]);

                if(i!=size-1) str.append(",");
            }

            str.append("]");

            return str.toString();


        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(10);
        obj.add(100);
        obj.add(500);

        System.out.println(obj.toString());

//
//        Integer get1=(Integer) obj.get(0);
//        String  get2=(String) obj.get(0);
//        Character get3=(Character) obj.get(0);


    }


}
