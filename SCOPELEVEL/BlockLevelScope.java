
package SCOPELEVEL;
class Mathematics{

    void demo(){
       int a=10;
       System.out.println(a);
        {
            int b=50;
            System.out.println(b);
        }

        {
            int b=100;
            System.out.println(b);
        }

    }

}
public class BlockLevelScope {

    public static void main(String[] args) {

        Mathematics obj=new Mathematics();
        obj.demo();



    }
}
