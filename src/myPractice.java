public class myPractice {

    interface parent {

        void eat();

        static void run() {

            System.out.println(" parent runs ");
        }

        default void parentSing() {

            System.out.println(" parent sings ");
            parentDance();
        }

        private void parentDance() {

            System.out.println(" parent dance ");
        }
    }


    interface child extends parent {

        @Override
       default void eat(){
            System.out.println(" parent eat ");
        }

        void bite();

        static void run() {

            System.out.println(" child  runs ");
        }

        default void childSings() {

            System.out.println(" child sings ");
            childDance();
        }

        private void childDance() {

            System.out.println(" child dance ");
        }
    }

   static class Human implements child {

//        public void eat(){
//
//            System.out.println(" Human eat ");
//        }


        public void bite(){

            System.out.println(" Human bite ");

        }


        void act(){

            System.out.println(" human acts ");
        }



    }


    public static void main(String[] args) {













    }
}
