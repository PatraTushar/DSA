package MathForDsa1ByKK;

public class Q3 {

    static int getIthBit(int number,int ith){

        int mask=1<<ith;

        return (number & mask)!=0 ? 1:0;


    }

    public static void main(String[] args) {

        int number=0b10110110;
        int ith=3;
        System.out.println(getIthBit(number,ith));
    }
}
