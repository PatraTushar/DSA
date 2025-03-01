package MathForDsa1ByKK;

public class Q5 {

    static int resetTheIthBit(int number,int ith){

        int mask=1<<ith;

        return number &  ~mask;

    }

    public static void main(String[] args) {

        int number=0b1010110;
        int ith=2;

        int ans=resetTheIthBit(number,ith);
        System.out.println(Integer.toBinaryString(ans));





    }
}
