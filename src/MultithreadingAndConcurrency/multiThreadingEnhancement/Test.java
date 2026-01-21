package MultithreadingAndConcurrency.multiThreadingEnhancement;

public class Test {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName()); // main

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); // system
    }
}
