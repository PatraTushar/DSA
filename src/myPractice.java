import java.util.LinkedList;
import java.util.Queue;

public class myPractice {


    public static class stack {

        Queue<Integer> original = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>();


        public void push(int ele) {

            original.add(ele);
        }


        public int pop() {

            if (original.isEmpty()) return -1;

            while (original.size() > 1) {

                helper.add(original.remove());
            }

            int top = original.remove();


            Queue<Integer> temp = original;
            original = helper;
            helper = temp;


            return top;

        }

        public int peek() {

            if (original.isEmpty()) return -1;

            while (original.size() > 1) {

                helper.add(original.remove());
            }

            int top = original.remove();

            helper.add(top);


            Queue<Integer> temp = original;
            original = helper;
            helper = temp;


            return top;

        }


        public boolean isEmpty(){

            return original.isEmpty();
        }





    }




    public static void main(String[]
                                    args) {

        stack st = new stack();


    }

}





