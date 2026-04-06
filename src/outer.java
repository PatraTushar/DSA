
public class outer {
    int i=10;
    static int j=20;

    public  void m1(){

        int k=30;
        final int m=40;



      class inner{

           public  void m2(){

              System.out.println(i);
              System.out.println(j);
              System.out.println(k);
              System.out.println(m);



          }
      }

      inner i=new inner();
      i.m2();

  }


    public static void main(String[] args) {
        outer o=new outer();
        o.m1();
    }


}

