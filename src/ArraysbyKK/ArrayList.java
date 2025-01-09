package ArraysbyKK;

public class ArrayList {

    public static void main(String[] args) {

        //        //wrapper class
//
//        Integer in=Integer.valueOf(4);
//        System.out.println(i);
//
//        Float f=Float.valueOf(4.5f);
//        System.out.println(f);

        java.util.ArrayList<Integer> l1=new java.util.ArrayList<>();
        //  ArrayList<Boolean> l2=new ArrayList<>();

        //add new elements
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
        //    System.out.println(l1.get(1));

        //print with for loop

//        for(int i=0;i<l1.size(); i++){
//            System.out.println(l1.get(i));
//        }

        //print the arraylist directly

        System.out.println(l1);  //[5,6,7,8]

        //adding element at some index i    //[5,100,6,7,8]

        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i

        l1.set(1,10);  //[5,10,6,7,8]
        System.out.println(l1);


        //removing an element at index i
        l1.remove(1);           //[5,6,7,8]
        System.out.println(l1);


        //removing an element e

        l1.remove(Integer.valueOf(7));
        System.out.println(l1);  //[5,6,8]

        //checking if an element exists

        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if you don't specify class ,you can put anything inside l

        java.util.ArrayList l=new java.util.ArrayList();
        l.add("qwerty");
        l.add(1);
        l.add(true);
        System.out.println(l);




    }
}
