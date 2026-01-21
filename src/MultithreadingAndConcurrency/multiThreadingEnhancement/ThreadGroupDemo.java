package MultithreadingAndConcurrency.multiThreadingEnhancement;

public class ThreadGroupDemo {

    public static void main(String[] args) {

        ThreadGroup g1=new ThreadGroup("First Group");
        System.out.println(g1.getParent().getName());   // main

        ThreadGroup g2=new ThreadGroup(g1,"Second Group");
        System.out.println(g2.getParent().getName());  // First Group       Because we pass g1 as the parent ThreadGroup, g2 belongs to First Group.

    }
}
