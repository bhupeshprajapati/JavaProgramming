//This program is synchronized using Synchronized block on line 28.
class Callme {
    void call(String msg) { // removed synchronized keyword.
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    Caller(Callme targ, String s) {
        msg = s;
        target = targ;
        t = new Thread(this);
        t.start();
    }

    // Synchronize calls to call().
    public void run() {
        synchronized (target) {// Synchronized block.
            target.call(msg);
        }
    }
}

class usingSynchronizedBlock {
    public static void main(String[] args) {
        Callme target = new Callme();
        System.out.println("Made an instance target of Callme class which contains call() method.");
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");

        // wait for threads to end
        try {
            // System.out.println("Waiting for all threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("main thread Interrupted");
        }
    }
}
// Output of this program is as expected.
// [Hello]
// [Synchronized]
// [World]