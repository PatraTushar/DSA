

public class myPractice {

    interface dog {

        void bark();

        default void dance(){

            System.out.println(" dog dance ");


        }
    }

    interface cat extends dog {

        void meow();



    }


    public static class Animal implements cat {

        @Override
        public void bark() {

            System.out.println(" Animal bark ");
        }

        @Override
        public void meow() {

            System.out.println(" Animal meow ");
        }



    }

    public static void main(String[] args) {

        dog obj=new Animal();
        obj.bark();
        obj.dance();

        cat obj2=new Animal();
        obj2.meow();
        obj2.bark();
        obj2.dance();


        Animal obj3=new Animal();
        obj3.bark();
        obj3.meow();
        obj3.dance();



    }


}
