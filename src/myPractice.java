


public class myPractice {

    public static void main(String[] args) {

        ThreadGroup group =new ThreadGroup("ThreadGroup");
        Thread t1=new Thread(group,"First Thread");
        Thread t2=new Thread(group,"Second Thread");

        group.setMaxPriority(3);

        Thread t3=new Thread(group,"Third Thread");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());


    }


}

