
package ARRAYS;
class ArrayExample {
    void demoArrays() {
        //  1D array
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];

        ages[0] = 34;
        ages[1] = 45;
        ages[2] = 78;


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

    }


        //2D array
        void multiArrays(){

            int[][] arr = new int[5][3];

            arr[0][0] = 45;
            arr[0][1] = 49;
            arr[0][2] = 40;


            System.out.println(arr[0][0]);
            System.out.println(arr[0][1]);
            System.out.println(arr[0][2]);

        }

    }

    public class Arrays {

        public static void main(String[] args) {

            ArrayExample obj = new ArrayExample();
            obj.multiArrays();


        }
    }

