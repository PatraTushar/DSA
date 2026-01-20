package MultithreadingAndConcurrency.Deadlock;


class A {

    // synchronized → lock is taken on CURRENT OBJECT → object 'a'
    public synchronized void d1(B b) {

        // STEP 5:
        // Main thread enters this method
        // Main thread ACQUIRES lock of object 'a'

        System.out.println(" Thread 1 starts execution of d1() method ");

        try {
            // STEP 6:
            // Main thread goes to sleep
            // IMPORTANT: lock of object 'a' is NOT released

            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        // STEP 7:
        // Main thread still holds lock of object 'a'
        // Now it tries to call b.last()
        // To enter b.last(), lock of object 'b' is required

        System.out.println(" Thread 1 trying to call B's last() method ");

        // STEP 8:
        // Main thread waits here if lock of 'b' is not available

        b.last();
    }

    // synchronized → requires lock of object 'a'
    public synchronized void last() {

        // Will execute ONLY if lock of object 'a' is available

        System.out.println(" Inside A, last method ");

    }
}

class B {


    // synchronized → lock is taken on CURRENT OBJECT → object 'b'
    public synchronized void d2(A a) {

        // STEP 9:
        // Child thread enters this method
        // Child thread ACQUIRES lock of object 'b'

        System.out.println(" Thread 2 starts execution of d2() method ");

        try {
            // STEP 10:
            // Child thread goes to sleep
            // IMPORTANT: lock of object 'b' is NOT released

            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        // STEP 11:
        // Child thread still holds lock of object 'b'
        // Now it tries to call a.last()
        // To enter a.last(), lock of object 'a' is required

        System.out.println(" Thread 2 trying to call A's last() method ");

        // STEP 12:
        // Child thread waits here if lock of 'a' is not available

        a.last();
    }


    // synchronized → requires lock of object 'b'
    public synchronized void last() {

        // Will execute ONLY if lock of object 'b' is available

        System.out.println(" Inside B, last method ");

    }


}

class DeadlockDemo extends Thread {

    // STEP 1:
    // Two independent objects created in heap
    A a = new A();
    B b = new B();

    public void m1() {

        // STEP 2:
        // Main thread starts child thread

        this.start();

        // STEP 4:
        // Main thread calls d1() using object 'a'
        // Main thread tries to acquire lock of object 'a'

        a.d1(b);   // main thread execute
    }

    public void run() {

        // STEP 3:
        // Child thread executes run()
        // Child thread calls d2() using object 'b'
        // Child thread tries to acquire lock of object 'b'

        b.d2(a);   // child thread execute
    }

    public static void main(String[] args) {

        // STEP 0:
        // Program starts with main thread

        DeadlockDemo d = new DeadlockDemo();

        // STEP 1 execution begins
        d.m1();
    }

}


// In the above program if we remove at least one synchronized keyword then the program won't enter into deadlock. Hence synchronized keyword is the only reason for deadlock situation .Due to this using synchronized keyword we have to take special care