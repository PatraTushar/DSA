

public class myPractice {

    public static class Box<T>{

        T value;

        public T set(T val){

            this.value=val;
            return value;

        }


        public <T> T  get(T ip){

            return ip;



        }
    }


    public static void main(String[] args) {

        Box<Integer> obj=new Box<>();
        System.out.println(obj.get(10));
        System.out.println(obj.set(100));





    }
}
