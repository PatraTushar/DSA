package MathForDsa1ByKK;



public class Q4 {

    static int setTheIthBit(int number,int ith){

        int mask=1<<ith;

        return number | mask   ;
    }

    public static void main(String[] args) {
        int number=0b1010110;
        int ith=3;

        int newNumber=setTheIthBit(number,ith);
        System.out.println(number);
        System.out.println(" before " +Integer.toBinaryString(number));
        System.out.println(newNumber);
        System.out.println(" after " +Integer.toBinaryString(newNumber));
    }
}

