
package ARRAYS;
class Arraysss{

    void traverse(){
        int[][] arr=new int[3][3];
        arr[0][0]=88;
        arr[0][1]=88;
        arr[0][2]=88;

        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }

        }


    }


}
public class TraverseInArrayss {

    public static void main(String[] args) {

        Arraysss obj=new Arraysss();
                obj.traverse();

    }
}
