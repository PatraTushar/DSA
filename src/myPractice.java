

class Alphabet{

    public void a2Z(){


        System.out.println(" A to Z");
    }
}
interface A {

    void showA();
}


interface B{

    void showB();
}


interface combination<T extends Alphabet &  A & B>{

    void comb(T a);

}



public class myPractice {


    public static class finalClass  implements combination<AB>{

        @Override
        public void comb(AB a) {


            a.a2Z();
            a.showA();
            a.showB();
        }
    }

    public static class AB extends Alphabet implements A,B{

        @Override
        public void showA() {

            System.out.println("AB shows A");
        }

        @Override
        public void showB() {

            System.out.println(" AB shows B");
        }
    }

    public static void main(String[] args) {

        combination<AB> obj=new finalClass();
        obj.comb(new AB());


    }
}
