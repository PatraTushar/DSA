package Hashmap.Basics;

public class NonPerfectHashFunction {

    static int simpleHash(int val) {

        return val % 10;
    }

    public static void main(String[] args) {

        int[] arr={21,31,41,51};

        for(int ele:arr){
            System.out.println("Key: " + ele + ", Hash: " + simpleHash(ele));
        }




    }
}
